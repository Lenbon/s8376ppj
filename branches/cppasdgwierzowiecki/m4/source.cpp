#include <cstdio>

int main()
{
    bool change;
    char *str;

    const int maxlen = 1000;
    str = new char[maxlen + 1];

    fscanf(stdin, "%s", str);
    fprintf(stdout, "%s\n", str);

    for (int i='A'; i <= 'Z'; ++i) {
        change = false;
        for (int j = 0; str[j] != '\0'; ++j)
            if (str[j] == i) {
                str[j] = '_';
                change = true;
            }
        if (change)
            fprintf(stdout, "%s\n", str);

    }

    delete[] str;

    return 0;
}

