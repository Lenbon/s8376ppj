#include <cstdio>

double funf(unsigned long long x, unsigned long long *a)
{
    return ((x * x * x) * a[0]) + ((x * x) * a[1]) + (x * a[2]) + a[3];
}

double fung(unsigned long long x, unsigned long long *a)
{
    return ((x * x) * a[0]) + (x * a[1]) + a[2];
}

unsigned long long rek(unsigned long long x, unsigned long long *a, unsigned long long *g)
{
    double xne = ((double) x) - (funf(x, a) / fung(x, g));

    double xnemx = xne - (double) x;
    if (xnemx < 0)
        xnemx *= -1;

fprintf(stdout, "xnemx: %d", &xnemx);

    if (xnemx < 0.001) {
        return xne;
    } else {
        return rek(xne, a, g);
    }
}

unsigned long long dof(unsigned long long y, unsigned long long *a)
{
    unsigned long long x = 0;
    unsigned long long g[3];

    g[0] = a[0] * 3;
    g[1] = a[1] * 2;
    g[2] = a[2] * 1;

    int dg = g[1] * g[1] - 4 * g[0] * g[2];

    if (dg <= 0) {
        fprintf(stdout, "%s", "jest");
    } else {
        fprintf(stdout, "%s", "BRAK");
    }


    fprintf(stdout, "=%lld=", funf(x, a));
    fprintf(stdout, "=%lld=", fung(x, g));

    long xne = rek(x, a, g);
    fprintf(stdout, "===%ld===", xne);

    return xne;
}

int main()
{
    int c;
    unsigned long long a[4], y;

    fscanf(stdin, "%d", &c);

    while (c--) {
        fprintf(stdout, "%d: ", c);
        fscanf(stdin, "%lld%lld%lld%lld%lld", &y, &(a[0]), &(a[1]), &(a[2]), &(a[3]));
        fprintf(stdout, "%lld\n", dof(y, a));
    }
   
    return 0;
}

