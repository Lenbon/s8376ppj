/*
 * Zajecia 1 - zadanie 5
 *
 * Napisz funkcję SumaLiczbPierwszych wyznaczającą sumę liczb pierwszych z zakresu od 0 do n,
 * gdzie n jest całkowite i większe od zera (zwróć uwagę na obsługę błędów).
 * Uwaga: wartość n jest podawana przez użytkownika. Poprawne wywołanie poniższej funkcji
 * powinno mieć postać jak poniżej.
 *
 * Przykładowa deklaracja funkcji, powinna być umieszczona w tym miejscu (przed funkcją main) i wygląda jak poniżej:
 * long SumaLiczbPierwszych(int);    // deklaracja funkcji
 * int main(void)
 * {
 *      long n = 0;
 *      cout << "Podaj liczbę całkowitą większą od 0";
 *      cin >> n;
 *      long wynik = SumaLiczbPierwszych(n);
 *
 *      if (wynik<0) {
 *          cerr << "Niestety podana wartość jest mniejsza od 0";
 *          return –1;
 *      }
 *      else
 *          cout << "Wynik = " << wynik;
 *      return 0;
 * }
 *
 * Definicja funkcji, powinna być umieszczona w tym miejscu (za funkcją main) i wygląda jak poniżej:
 * long SumaLiczbPierwszych(int n) {       // definicja funkcji
 *      ...................................
 * }
 *
 * Version: $Id$
 */
#include <iostream>
#include "deklaracje.h"
using namespace std;

int main(int argc, char **argv)
{
    int n = 0;

    cout << "Podaj liczbę całkowitą większą od 0 - ";
    cin >> n;

    if (n < 0) {
        cerr << "Niestety podana wartość jest " << n << " mniejsza od 0" << endl;
        return -1;
    }

    cout << "Wynik = " << sumaLiczbPierwszych(n) << endl;

    return 0;
}

