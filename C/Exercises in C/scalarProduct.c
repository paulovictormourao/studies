/*Scalar Product of Two Vectors.
Author: Paulo Victor Mourão
Last Modified on: 05/04/2023

this program determines the scalar product
between 2 vectors of size N.
*/

#include <stdio.h>
#include <stdlib.h>

float *alloc(int len){
	int i;
	float *vet;
	
	vet = (float *)  malloc(len * sizeof(float));
	
	for (i = 0; i < len; i++){
		printf("%dº term: ", i + 1 );
		scanf("%f", vet + i);
	}
	
	printf("\n");
	
	return vet;
}

float scalarProduct(float *vetA, float *vetB, int len){
	int i;
	float sum;
	
	for(i = 0; i < len; i++){
		sum += *(vetA + i) * *(vetB + i);	
	}
	
	return sum;
}


int main(){
	int n;
	float *vet1, *vet2, product;

	
	printf("Type the number of terms of the vectors: ");
	scanf("%d", &n);
	printf("\n");

	
	printf("First Vector\n");
	vet1 = alloc(n);
	printf("Second Vector\n");
	vet2 = alloc(n);

	
	product = scalarProduct(vet1, vet2, n);

	
	printf("the scalar product is %.1f", product);


	return 0;
}
