/*
 * Napisz program, w którym użytkownik będzie musiał wprowadzić jedną liczbę rzeczywistą,
 * a następnie oddzielnie zostanie wyświetla jej część całkowita i ułamkowa np.:
 *
 * Wprowadź liczbę:        654.39
 * Cześć całkowita   =     654
 * Cześć ułamkowa    =     0.39
 *
 * Version: $Id$
 */
#include <iostream>
using namespace std;

int main(int argc, char **argv)
{
    float number;

    cout << "Podaj liczbe ";
    cin >> number;
    cout << "Liczba: " << number << endl;

    cout << "Czesc calkowita = " << (int) number << endl;
    cout << "Czesc ulamkowa = " << number - (int) number << endl;

    return 0;
}

