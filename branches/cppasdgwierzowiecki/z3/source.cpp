#include <cstdio>

long long f(long x, long *a)
{
    return ((a[3] * x + a[2]) * x + a[1]) * x + a[0];
}

int main()
{
    int c;
    long a[4], x, y;
    fscanf(stdin, "%d", &c);

    while (c--) {
        fscanf(stdin, "%ld%ld%ld%ld%ld",
            &x, &(a[0]), &(a[1]), &(a[2]), &(a[3]));
        y = f(x, a);
        fprintf(stdout, "%ld\n", y);
    }

    return 0;
}

