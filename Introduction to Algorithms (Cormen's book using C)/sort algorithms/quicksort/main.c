#include <stdio.h>
#include <time.h>
#include "quicksort.c"


int main(int argc, char** argv)
{
    int i, size = 1000;
    int vet[size];
    double start, finish, elapsed;


    for (i = 0; i < size; i++){
        scanf("%d", &vet[i]);
    }

    start = (double) clock() / CLOCKS_PER_SEC;

    quick_sort(vet, 0, size - 1);

    finish = (double) clock() / CLOCKS_PER_SEC;
    elapsed = (double) finish - start;


    printf("%fs\n", elapsed);

    return 0;
}