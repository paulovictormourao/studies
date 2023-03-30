/* Cryptography in C
Author: Paulo Victor Mourão
Last Modified on: 30/03/2023


In the first pass, characters must be shifted 3 positions 
to the right, according to the ASCII table: letter 'a' must 
become letter 'd', letter 'y' must become character '|' and so on. 
On the second pass, the line must be inverted. On the third and 
final pass, any and all characters from the middle (truncated) onwards
must be shifted one position to the left in the ASCII table.
In this case, 'b' becomes 'a' and 'a' becomes '`'. 
*/



#include <stdio.h>
#include <stdlib.h>


char *alloc(int len){
	char *str;
	str = (char * ) malloc(sizeof(char) * (len));
	printf("Type a word with %d letters: ", len);
	scanf("%s", str);
	printf("\n");

	return str;
}


int main(){
	int i, n;
	char *vet;
	char aux;	
	
	
	printf("type the number of letters in the word that you want to encrypt:  ");
	scanf("%d", &n);
	
	
	vet = alloc(n);
	
	
	for (i = 0; i < n; i++){
		
		*(vet + i) += 3;
	}
	
	
	for (i = 0; i < n - 1; i++){
		if (n/2 > i){
			aux = *(vet + i) - 1;
			
			*(vet + i) = *(vet + n - i - 1);
			*(vet + n - i - 1) = aux;
			
		
		}
		
			
	}
	printf("Encripted:  ");
	for (i = 0; i < n; i++){
		printf("%c", *(vet + i));
	}
	printf("\n");
	
	return 0;
}
