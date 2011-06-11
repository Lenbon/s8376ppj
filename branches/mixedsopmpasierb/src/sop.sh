#!/bin/bash
echo "Hello world!"


read -p "Tryb1: " mode1
read -p "Tryb2: " mode2

read -p "Ciag znakow: " string

export mode2="$mode2"

javac Filter.java
java -Dmode1="$mode1" Filter $string

