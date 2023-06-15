
void bubble_sort (int vet[], int n) {
    int k, j, aux;

    for (k = 1; k < n; k++) {
        for (j = 0; j < n - 1; j++) {

            if (vet[j] > vet[j + 1]) {

                aux          = vet[j];
                vet[j]     = vet[j + 1];
                vet[j + 1] = aux;
            }
        }
    }
}