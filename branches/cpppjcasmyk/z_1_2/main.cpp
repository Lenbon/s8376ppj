/*
 * Napisz program, w którym użytkownik będzie musiał wprowadzić trzy liczby całkowite
 * bez znaku (to nie oznacza dodatnie, wykorzystaj typ – unsigned int)
 * a program wyświetli środkową z nich.
 *
 * Version: $Id$
 */
#include <iostream>
using namespace std;

int main(int argc, char **argv)
{
    unsigned int a, b, c;
    cout << "Podaj trzy liczby ";
    cin >> a >> b >> c;
    cout << "a = " << a << "\nb= " << b << "\nc= " << c << endl;

    // if (a < b < c) ;
    if ((b < a && a < c) || (c < a && a < b))
        cout << "Srodkowa jest " << a;
    if ((a < b && b < c) || (c < b && b < a))
        cout << "Srodkowa jest " << b;
    if ((a < c && c < b) || (b < c && c < a))
        cout << "Srodkowa jest " << c;
    
    return 0;
}

