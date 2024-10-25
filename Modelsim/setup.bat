@echo off
set SCRIPT_PATH=%~d0"%~p0"
set CMD_NAME=%SCRIPT_PATH%components\QuartusSetupWeb-13.0.1.232.exe
START %CMD_NAME% %*
