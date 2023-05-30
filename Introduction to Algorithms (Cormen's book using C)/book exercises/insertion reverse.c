#include <stdio.h>
#include "Functions/fill_and_print.h"

int main ()
{
    int i, j, aux, len;

    printf("size of the list: ");
    scanf("%d", &len);

    int list[len];

    fill(list, len);

    // Sort
    for (i = 1; i < len; i++)
    {
        aux = list[i];

        j = i - 1;

        while( (j >= 0) && (aux > list[j]) )
        {

            list[j + 1] = list[j];

            j--;
        }
        list[j + 1] = aux;
    }


    print(list, len);

    return 0;

}