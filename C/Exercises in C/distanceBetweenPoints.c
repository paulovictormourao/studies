/* Distance Between 2 points In C
Author: Paulo Victor Mourão
Last Modified on: 30/03/2023

This program read two points of type: "Pn = (Xn, Yn)"
and calculates the distance between they.
*/

#include <stdio.h>
#include <math.h>

void scanCoordinades( float *point, int n ){
	printf("x%d: ", n);
	scanf("%f", point);
				
	printf("y%d: ", n);
	scanf("%f", point + 1);
}


float distancePoints(float *p1, float *p2){
	int i;
	float aux = 0;
	
	for (i = 0; i < 2; i++){
		aux += pow((p2[i] - p1[i]), 2);
	}
	
	return sqrt(aux);
}


int main( ){
	float distance;
	float p1[1], p2[1];
	
	
	scanCoordinades(p1, 1);
	scanCoordinades(p2, 2);

	distance = distancePoints(p1, p2);
	
	printf("The Distance is: %.4f", distance);
} 
