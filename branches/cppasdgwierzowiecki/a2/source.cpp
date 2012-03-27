#include <cstdio>

struct node
{
	public:
		long data;
		node *next;
};

int main()
{
	node *x, *y;

	x = new node; x->data = 5; x->next = NULL;
	y = new node; y->data = 6; y->next = x;
	x = y;
	y = new node; y->data = 7; y->next = x;

	fprintf(stdout, "%ld %ld %ld\n", y->data, y->next->data, y->next->next->data);

	return 0;
}

