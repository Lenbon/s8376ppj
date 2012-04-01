/*
 * converter.cpp
 *
 * @version $Id$
 */
#include <iostream>
#include <cstdio>
using namespace std;
 
string convert(int number, int base)
{
    int mark;
    string result = "";
    string tmp;
                 
    while (number > 0) {
        mark = number % base;
        if (mark > 9) {
            result = char(97 - 10 + mark) + result;
        } else {
            sprintf((char*) tmp.c_str(), "%d", mark);
            result = tmp.c_str() + result;
        }
                                                                                                     
        number = number / base;
    }
    
    return result;
 }

