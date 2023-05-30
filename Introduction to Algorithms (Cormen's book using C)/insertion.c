/*
         2
I)   {5, 2, 4, 6, 1, 3}
->       5

            4
II)  {2, 5, 4, 6, 1, 3}
->          5

               6
III) {2, 4, 5, 6, 1, 3}

                  1
IV)  {2, 4, 5, 6, 1, 3}
->       2  4  5  6

                     3
V)   {1, 2, 4, 5, 6, 3}
->             4  5  6

IV)  {1, 2, 3, 4, 5, 6}
 */

#include <stdio.h>

int main ()
{
    int i, j, aux;
    int list[] = {5, 2, 4, 6, 1, 3};

    for (i = 1; i < 6; i++)
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


    for (i = 0; i < 6; i++)
    {
        printf("%d ", list[i]);
    }

    return 0;
}