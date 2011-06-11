#!/bin/bash

read -p "Tryb1 - nowa linia / znak (t/f): " mode1
read -p "Tryb2 - wielkie litery (t/f): " mode2



#read -p "Ciag znakow: " string
string="Ala ma Kota"

export mode1="$mode1"

javac Filter.java
java -Dmode2="$mode2" Filter "$string"

