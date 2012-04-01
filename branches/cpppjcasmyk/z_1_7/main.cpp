/*
 * Napisz funkcję, która pobierze liczbę w systemie dziesiętnym i wyświetli ją we wszystkich
 * systemach liczenia od binarnego począwszy a na hexadecymalnym skończywszy.
 *
 * Version: $Id$
 */
#include <iostream>
#include "converter.h"
using namespace std;

int main(int argc, char **argv)
{
    int number;

    cout << "Podaj liczbe: " << endl;
    cin >> number;

    if (number <= 0) {
        cerr << "Liczba musi być większa od 0" << endl;
        return 1;
    }

    cout << "Liczba: " << number << endl;
    for (int i = 2; i <= 16; i++) {
        cout << "Liczba w systemie o podstawie " << i << ": "
            << convert(number, i) << endl;
    }

    return 0;
}

