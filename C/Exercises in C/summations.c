/*Basic Summations 1
Author: Paulo Victor Mourão
Last Modified on: 04/04/2023

summation1 is of type S += 1/i, i = 1 until i == n .
summation2 is of type S += 1/(i + 1), i = 1 until i == n.
*/

#include <stdio.h>

float summation1(int n){
	float i;
	float total = 0;
	
	for (i = 1; i <= n; i++){
		total += 1 / i;
	} 
	return total;
}


float summation2(int n){
	float i;
	float total = 0;
	
	for (i = 1; i <= n; i++){
		total += 1 / (i +1);
	} 
	return total;
}


int main( ){
	int n;
	float s1, s2;
	
	scanf("%d", &n);
	
	s1 = summation1(n);
	s2 = summation2(n);


	printf("total 1/i = %.2f \n", s1);	
	printf("total 1/(i + 1) = %.2f \n", s2);
	  
	return 0;
}
