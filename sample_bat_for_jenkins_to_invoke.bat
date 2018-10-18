echo GIT_BRANCH="%GIB_BRANCH%"   # e.g. 'origin/master'
set url=https://%GIT_BRANCH:origin/=%-devui.windsorcircle.com
echo url=%url%

set KATALONSTUDIO_HOME="C:\Katalon_Studio_Windows_64-5.7.0"
.\run_console_mode.bat

