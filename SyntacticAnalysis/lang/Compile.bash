java -jar ./antlr-4.8-complete.jar -o ./parser/ LangLexer.g4
java -jar ./antlr-4.8-complete.jar -o ./parser/ LangParser.g4 -visitor

javac -cp .:antlr-4.8-complete.jar ast/*.java parser/*.java LangCompiler.java -d .
java -classpath .:antlr-4.8-complete.jar lang.LangCompiler -bs