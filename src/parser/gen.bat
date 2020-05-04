@echo off
setlocal
if "%1" == "" goto :usage

if "%1" == "-initial" (
	set OPTIONS=-Dgenerate.subclasses=true
	shift
)


cd ..\.. & call maven.bat -b jar & cd src\parser

rem Generate parser
%JAVA_HOME%\bin\java -classpath ..\..\lib\javacc-3.2.jar javacc -OUTPUT_DIRECTORY:sef sef.jj
%JAVA_HOME%\bin\javac -classpath ..\..\target\classes -d sef sef\*.java


echo Generating parser %*

rem Generate object model
cd sef

:generate
set DEST_DIR=..\..\java\com\webify\shared\edi\model\hipaa%1
echo Generating %1 object model to %DEST_DIR%

if not exist %DEST_DIR% mkdir %DEST_DIR%
if not exist %DEST_DIR%\beans mkdir %DEST_DIR%\beans

%JAVA_HOME%\bin\java %OPTIONS% -classpath .;..\..\..\target\classes SEFParser ..\%1.sef
if exist ..\%DEST_DIR%\beans\*.java (
	if exist BaseHipaa%1Document.java del /q %DEST_DIR%\beans\*.java
)
move /y Base* %DEST_DIR%\beans > :NUL
move /y Field* %DEST_DIR%\beans > :NUL
move /y Segment* %DEST_DIR%\beans > :NUL
move /y Compo* %DEST_DIR%\beans > :NUL
if exist Loop* move /y Loop* %DEST_DIR% > :NUL
if exist Hipaa* move /y Hipaa* %DEST_DIR% > :NUL
shift
if "%1" == "" goto :cleanup
goto :generate


:cleanup
del *.java *.class
cd ..
goto :exit


:usage
echo .
echo No HIPAA transaction number supplied to generate
echo .

:exit

