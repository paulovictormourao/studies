/* Product of 3 numbers
Author: Paulo Victor Mourão
Last Modified on: 07/04/2023

-Exercise 2.6 of the book: "Java: How To Program"

*/


import java.util.Scanner;

public class ProductExc1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float x1, x2, x3;
        float result;

        System.out.print("Type a Real Number: ");
        x1 = input.nextFloat();

        System.out.print("Type another Real Number: ");
        x2 = input.nextFloat();

        System.out.print("Type another: ");
        x3 = input.nextFloat();

        result = x1 * x2 * x3;


        System.out.printf("The Product is %.1f%n", result);
    }

}
