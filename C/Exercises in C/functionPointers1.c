/*Basic Funciton With Pointers 1
Author: Paulo Victor Mourão
Last Modified on: 04/04/2023

a function that takes a list of values and
returns the largest value, the smallest value,
and the average of all values. 
(using pointer arithmetic)*/



#include <stdio.h>
#include <stdlib.h>

int *alloc(int len){
	int i, *vet;
	
	vet = (int * ) malloc(sizeof(int) * (len));
	
	for (i = 0; i< len; i++){
		printf("# ");
		scanf("%d", vet + i);
	}
		
	
	printf("\n");

	return vet;
}


void function(int *vet, int len, int *lrg, int *sml, float *avr){
	int i;
	
	*sml = *vet;
	*lrg = *vet;
	*avr = 0;
	
	
	for (i = 0; i < len; i++){
		*avr += *(vet + i);
		
		if ( *(vet + i) < *sml){
			*sml = *(vet + i);
		}
		
		if ( *(vet + i) > *lrg){
			*lrg = *(vet + i);
		}
	
	}
	
	*avr /= len;
	
}

int main( ){
	int *list, n, lrg, sml, i;
	float avr;
	
	printf("Type the nuber of values: ");
	scanf("%d", &n);
	
	list = alloc(n);
	
	function(list, n, &lrg, &sml, &avr);
	
	printf("largest: %d\n", lrg);
	printf("smallest: %d\n", sml);
	printf("average: %f\n", avr);
	
	return 0;
}
