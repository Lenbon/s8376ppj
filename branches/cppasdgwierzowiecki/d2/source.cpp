#include <cstdio>
#include <unistd.h>
int main()
{
    unsigned char ch;

    while(fread(&ch, 1, 1, stdin)==1){
        unsigned int integer = ch;
        printf("%u\n", integer);
    }

    return 0;
}

