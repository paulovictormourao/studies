#include <stdio.h>



int main (int argc, char** argv)
{
    char name[] = "worst200000.txt";
    FILE *arquivo = fopen(name, "w");
    int i, j, aux, swap = 1, count = 1;
    int size = 200000;
    int list[size];


    for (i = 0; i < size; i++){
        scanf("%d", &list[i]);
    }


    for (i = 0; (i < size) && (swap == 1); i++)
    {
        swap = 0;

        for( j = 0; j < size - i - 1; j++ ) {

            if (list[j] < list[j + 1]) {
                swap = 1;
                aux = list[j];
                list[j] = list[j + 1];
                list[j + 1] = aux;
            }
                count++;
        }
    }

    freopen(name, "w", stdout);

    for (i = 0; i < size; i++)
    {
        printf("\n%d ", list[i]);
    }

    fclose(arquivo);

    return 0;
}