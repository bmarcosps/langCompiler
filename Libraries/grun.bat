@ECHO OFF
SET CLASSPATH=.;C:\Javalib\antlr-4.8-complete.jar;%CLASSPATH%
SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
@ECHO ON
java org.antlr.v4.gui.TestRig %*