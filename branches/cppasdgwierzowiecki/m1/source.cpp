/**
 * Zadanie M1
 */
#include <cstdio>

int main()
{
    long c, nLen, nVal, d;

    d = fscanf(stdin, "%ld", &c);

    d = fprintf(stdout, "%ld\n", c);

    char* input;

    for (int i = 0; i < c; i++) {
	d = fscanf(stdin, "%s", input);

d=fprintf(stdout, "%s\n", input);
	}

    return 0;
}

