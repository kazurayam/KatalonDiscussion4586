echo GIT_BRANCH="${GIB_BRANCH}"   # e.g. 'origin/master'
export url=https://${GIT_BRANCH##origin/}-devui.windsorcircle.com
echo url=$url

export KATALONSTUDIO_HOME="/Applications/Katalon Studio.app/Contents/MacOS"
./run_console_mode.sh

