#include <stdio.h>
#include <time.h>
#include "bubble.c"


int main (int argc, char** argv)
{
    double start, finish, elapsed;
    int i;
    int size = 1000;
    int list[size];


    for (i = 0; i < size; i++){
        scanf("%d", &list[i]);
    }

    start = (double) clock() / CLOCKS_PER_SEC;

    bubble_sort(list, size);

    finish = (double) clock() / CLOCKS_PER_SEC;

    elapsed = (double) finish - start;

    printf("%f", elapsed);

    return 0;
}
