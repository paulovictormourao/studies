#include <stdio.h>

int main ()
{
    int i, j, aux, swap = 1;
    int list[] = {5, 2, 4, 1, 3};

    for (i = 0; (i < 5) && (swap == 1); i++)
    {
        swap = 0;

        for( j = 0; j < 5 - i - 1; j++ ) {
            if (list[j] > list[j + 1]) {
                swap = 1;
                aux = list[j];
                list[j] = list[j + 1];
                list[j + 1] = aux;
            }

        }
    }


    for (i = 0; i < 5; i++)
    {
        printf("%d ", list[i]);
    }

    return 0;
}