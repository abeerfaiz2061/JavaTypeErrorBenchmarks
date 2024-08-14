@echo off
setlocal enabledelayedexpansion

rem ExtendJ directory path
set "extendj_path=C:\Users\Abeer Faiz Farid\Desktop\MSc Software Engineering\Semester 3\ExtendJ\extendj"

rem Eclipse ecj.jar file path
set "ecj_path=C:\Users\Abeer Faiz Farid\Downloads\ecj-4.6.1.jar"

rem Java version for ECJ compilation
set "java_version=1.8"

for %%f in (*.java) do (
    set "basename=%%~nf"
    echo Processing %%f...
    
    rem Create a javac header for the combined error log
    echo javac errors for %%f > "!basename!_error_report.txt"
    
    rem Compile the Java file with javac and append errors to the combined .txt file
    javac "%%f" 2>> "!basename!_error_report.txt"
    
    rem Append a separator between javac and ExtendJ errors
    echo. >> "!basename!_error_report.txt"
    echo ============================================================================= >> "!basename!_error_report.txt"
    echo ExtendJ errors for %%f >> "!basename!_error_report.txt"
    
    rem Change directory to the ExtendJ path
    pushd "%extendj_path%"
    
    rem Compile the Java file with ExtendJ and append errors to the combined .txt file
    java -jar extendj.jar "%~dp0%%f" 2>> "%~dp0!basename!_error_report.txt"
    
    rem Return to the original directory
    popd

    rem Append a separator between ExtendJ and ECJ errors
    echo. >> "!basename!_error_report.txt"
    echo ============================================================================= >> "!basename!_error_report.txt"
    echo Eclipse ECJ errors for %%f >> "!basename!_error_report.txt"

    rem Compile the Java file with Eclipse ECJ and append errors to the combined .txt file
    java -jar "%ecj_path%" -source %java_version% -target %java_version% -d . "%%f" 2>> "!basename!_error_report.txt"
    
    rem Check if the combined text file contains more than just headers
    for /f %%i in ('type "!basename!_error_report.txt" ^| find /c /v ""') do set "filesize=%%i"
    
    if !filesize! gtr 8 (
        echo Errors found in %%f, see !basename!_error_report.txt for details.
    ) else (
        echo No errors found in %%f, deleting error log.
        del "!basename!_error_report.txt"
    )
)

rem Keep the window open
echo All files processed.
pause
