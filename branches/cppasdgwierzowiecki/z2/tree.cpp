#include <cstdio>

void indent_it(char *s, int *i, int l) 
{
	switch (s[*i]) {
		case '\0': return; break;
		case '(': *i += 1; indent_it(s, i, l + 1); break;
		case ')': *i += 1; indent_it(s, i, l - 1); break;
		case '+':
		case '*':
		case '-':
		case '/':
			for (int j = l; j--;) fprintf(stdout, " ");
			fprintf(stdout, "%c\n", s[*i]);
			*i += 1;
			indent_it(s, i, l);
			break;
		default:
			for (int j = l; j--;) fprintf(stdout, " ");
			fprintf(stdout, " %c\n", s[*i]);
			*i += 1;
			indent_it(s, i, l);
			break;
	}
}

int main()
{
	char *s = new char[2048];
	int i = 0, dummy;
	// input : ((1+2)*3)*(4*(6-2))
	dummy = fscanf(stdin, "%s", s);
	indent_it(s, &i, 0);

	return 0;
}

