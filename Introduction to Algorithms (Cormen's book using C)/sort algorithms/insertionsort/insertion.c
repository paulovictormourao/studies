
void insertion(int list[], int size){
    int i, j, aux;

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
}