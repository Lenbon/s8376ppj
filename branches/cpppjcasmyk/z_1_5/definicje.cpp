/*
 * definicje.cpp
 *
 * Version: $Id$
 */
using namespace std;

/*
 * jeśli liczba naturalna N większa od 1 nie jest podzielna przez żadną
 * z liczb pierwszych nie większych od pierwiastka z N, to N jest liczbą pierwszą.
 *
 * http://www.math.edu.pl/algorytmy-pierwsze
 */
bool isPrimeNumber(int n)
{
    int r = sqrt(n);
    int i = 2;

    while (i <= r) {
        if (!(n % i++)) {
            return false;
        }
    }

    return true;
}

long sumaLiczbPierwszych(int number)
{
    cout << "Wejście: " << number << endl;

    long counter = 0;
    int lineCounter = 0;

    for (int x = 2; x < number; x++) {
        if (isPrimeNumber(x)) {
            counter += x;
            cout << ++lineCounter << ". " << x << endl;
        }
    }

    return counter;
}

