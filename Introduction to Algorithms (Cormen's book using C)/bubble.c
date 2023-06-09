#include <time.h>
#include <stdio.h>



int main (int argc, char** argv)
{
    int i, j, aux, swap = 1, count = 1;
    int size = 100;
    int list[size];
    double start, finish, elapsed;

    start = (double ) clock() / CLOCKS_PER_SEC;

    for (i = 0; i < size; i++){
        scanf("%d", &list[i]);
    }


    for (i = 0; (i < size) && (swap == 1); i++)
    {
        swap = 0;

        for( j = 0; j < size - i - 1; j++ ) {

            if (list[j] > list[j + 1]) {
                swap = 1;
                aux = list[j];
                list[j] = list[j + 1];
                list[j + 1] = aux;
            }
                count++;
        }
    }


    /*for (i = 0; i < size; i++)
    {
        printf("%d ", list[i]);
    }*/

    finish = (double ) clock() / CLOCKS_PER_SEC;
    elapsed = (double ) finish - start;

    printf("\n %f s\n", elapsed);

    return 0;
}