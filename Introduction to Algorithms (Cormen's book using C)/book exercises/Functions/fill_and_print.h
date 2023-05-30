#include <stdio.h>

void fill_list (int *list, int len)
{
    int i;

    for (i = 0; i < len; i++)
    {
            printf("[%d]: ", i + 1);
            scanf("%d", list + i);


    }
}

void print(int *list, int len)
{
    int i;

    for (i = 0; i < len; i++)
    {
        printf("%d ", *(list + i) );



    }
}