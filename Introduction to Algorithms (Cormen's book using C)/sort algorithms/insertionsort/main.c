#include <time.h>
#include <stdio.h>
#include "insertion.c"

int main (int argc, char *argv[])
{

    int size = 1000;
    int list[size];
    double start, finish, elapsed;

    for(int i  = 0; i < size; i++){
        scanf("%d", &list[i]);
    }

    start = (double) clock() / CLOCKS_PER_SEC;

    insertion(list, size);

    finish = (double) clock() / CLOCKS_PER_SEC;

    elapsed = (double) finish - start;

    printf("%f", elapsed);

    return 0;
}