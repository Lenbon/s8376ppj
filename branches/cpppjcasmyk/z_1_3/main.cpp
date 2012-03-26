/*
 * Co będzie wynikiem działania poniższego programu - operacje poprzednikowe i następnikowe.
 *
 * Version: $Id$
 */
#include <iostream>
using namespace std;

int main(int argc, char **argv)
{
    int f1 = 10, f2 = 20;

    cout << "Linia 1  " << f1++ + f2++ << endl;
    cout << "Linia 2  " << f1 << "," << f2++ << endl;
    f1 = 10;
    f2 = 20;
    cout << "Linia 3  " << ++f1 + ++f2 << endl;
    cout << "Linia 4  " << f1 << "," << f2++ << endl;

    return 0;
}

