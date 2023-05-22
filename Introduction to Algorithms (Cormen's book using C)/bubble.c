#include <stdio.h>

int main ()
{
    int i, j, aux;
    int list[] = {5, 2, 4, 6, 1, 3};

    for (i = 1; i < 6; i++)
    {

        for(j = 0; j < 6; j++)
        {
            if (list[i] < list[j])
            {
                aux = list[j];
                list[j] = list[i];
                list[i] = aux;
            }
        }
    }
    for (i = 0; i < 6; i++)
    {
        printf("%d ", list[i]);
    }

    return 0;
}