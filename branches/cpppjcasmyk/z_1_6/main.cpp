/*
 * Suma elementów tablicy  (znajdź błąd w poniższym programie)
 *
 * Version: $Id$
 */
#include <iostream>
using namespace std;

//delaracja tablicy jednowymiarowej 3 elementowej
int tab[] = { 10, 20, 30 };

int main(int argc, char **argv)
{
    int size = sizeof(tab) / sizeof(int); //wyznaczenie rozmiaru tablicy
    int suma = 0;// rzekomy blad, brak inicjacji zmiennej
    for (int i = 0; i < size; i++)
        suma += tab[i];
    cout << "Suma = " << suma << endl;

    return 0;
}

