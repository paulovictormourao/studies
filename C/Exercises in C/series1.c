/*Basic series 1
Author: Paulo Victor Mourão
Last Modified on: 05/04/2023

serie1 is of type an = 2n² – 1.
serie2 is of type an = a1 * q^(n - 1).
*/


#include <stdio.h>
#include <math.h>

void serie1 (int n){
	int i;
	
	for(i = 1; i <= n; i++){
		printf("%.0f ", 2*pow(i, 2) - 1 );
	}
	printf("\n");
}

void serie2 (int a1, int n, int r){
	int i;
	
	printf("%d ", a1);
	
	for(i = 2; i <= n; i++){
		printf("%.0f ", a1 * pow(r, i -1));
	}
}



int main(){
	int a1, r, n;
	
	printf("number of terms: ");	
	scanf("%d", &n);
	
	serie1(n);
	
	printf("first term: ");
	scanf("%d", &a1);
	
	printf("ratio: ");
	scanf("%d", &r);
	
	serie2(a1, n, r);
	
	return 0;
}
