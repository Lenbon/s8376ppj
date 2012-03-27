#include <cstdio>

long fib(int n, int l)
{
    long res = n;
    if (n == 2) res = 1;
    if (n > 2)
        return fib(n - 2, l + 1) + fib(n - 1, l + 1);
        
    for (int j = l; j--;) fprintf(stdout, " ");
    
    fprintf(stdout, "%ld\n", res);
    
    return res;
}

int main()
{
    int C, n, l = 0, dummy;
    
    dummy = fscanf(stdin, "%d", &C);
    
    while (C--) {
        dummy = fscanf(stdin, "%d", &n);
        dummy = fprintf(stdout, "%ld\n", fib(n, l));
    }

    return 0;
}

