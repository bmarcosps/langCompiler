#!/bin/bash
jflex lexicalDef.flex
javac *.java
java LexicalAnalyser prog1.lang