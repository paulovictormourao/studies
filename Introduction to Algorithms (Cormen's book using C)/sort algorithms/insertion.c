#include <time.h>
#include <stdio.h>

int main (int argc, char *argv[])
{
    int i, j, aux;
    int size ;
    scanf("%d", &size);

    int list[size];
    double start, finish, elapsed;



    for(i = 0; i < size; i++){
        scanf("%d", &list[i]);
    }
    start = (double) clock() / CLOCKS_PER_SEC;

    for (i = 1; i < size; i++)
    {
        aux = list[i];

        j = i - 1;

        while( (j >= 0) && (aux < list[j]) )
        {

            list[j + 1] = list[j];

            j--;
        }
        list[j + 1] = aux;
    }

    finish = (double) clock() / CLOCKS_PER_SEC;

    elapsed = (double) finish - start;

    printf("%fs\n", elapsed);

    return 0;
}