#include <stdio.h>
#include <stdlib.h> // srand, rand
#include <time.h> // time


void troca(int vet[], int j, int i)
{
    int aux = vet[i];
    vet[i] = vet[j];
    vet[j] = aux;
}

int particiona(int vet[], int inicio, int fim)
{
    int pivo, pivo_indice, i;

    pivo = vet[fim];
    pivo_indice = inicio;

    for(i = inicio; i < fim; i++)
    {

        if(vet[i] <= pivo)
        {

            troca(vet, i, pivo_indice);

            pivo_indice++;
        }
    }

    troca(vet, pivo_indice, fim);

    return pivo_indice;
}

int particiona_random(int vet[], int inicio, int fim)
{

    int pivo_indice = (rand() % (fim - inicio + 1)) + inicio;

    troca(vet, pivo_indice, fim);

    return particiona(vet, inicio, fim);
}

void quick_sort(int vet[], int inicio, int fim)
{
    if(inicio < fim)
    {

        int pivo_indice = particiona_random(vet, inicio, fim);

        quick_sort(vet, inicio, pivo_indice - 1);
        quick_sort(vet, pivo_indice + 1, fim);
    }
}

int main()
{
    int i, size;
    scanf("%d", &size);

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