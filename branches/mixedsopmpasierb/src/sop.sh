#!/bin/bash

fileName=`basename $0`

if [ $fileName = "mode1.sop" ]; then
	mode1=true
elif [ $fileName = "mode2.sop" ]; then
	mode2=true
else
	read -p "Tryb1 - nowa linia / znak (t/f): " mode1
	read -p "Tryb2 - wielkie litery (t/f): " mode2
fi;
read -p "Ciag znakow: " string

export mode1="$mode1"

export CLASSPATH=~/workspace/sop
export JAVA_HOME=~/workspace/sop

if [ -a `which java` ]; then
	run=`which java`
elif [ $JAVA_HOME != "" ]; then
	run=$JAVA_HOME
else
	read -p "Podaj scieke do java: " run
fi;

javac Filter.java
$run -Dmode2="$mode2" Filter "$string"
