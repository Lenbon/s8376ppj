#include <cstdio>

long fib(int n)
{
	long res = n;
	if (n == 2) res = 1;
	if (n > 2)
		return fib(n - 2) + fib(n - 1);

	return res;
}

int main()
{
	int C, n, dummy;
	dummy = fscanf(stdin, "%d", &C);

	while (C--) {
		dummy = fscanf(stdin, "%d", &n);
		dummy = fprintf(stdout, "%ld\n", fib(n));
	}

	return 0;
}

