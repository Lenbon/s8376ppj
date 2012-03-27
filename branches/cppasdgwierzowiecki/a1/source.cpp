#include <cstdio>
int main() {
	long a,b,c;

	fscanf(stdin, "%ld%ld", &a, &b);

	c = a * b;

	fprintf(stdout, "%ld\n", c);

	return 0;
}

