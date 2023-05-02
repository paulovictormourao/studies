/* Basic Arithmetic
Author: Paulo Victor Mourão
Last Modified on: 07/04/2023
-Exercise 2.15 of the book: "Java: How To Program"
*/


import java.util.Scanner;
public class ArithmeticExc2 {
    public static void main(String[ ] args){
        Scanner input = new Scanner(System.in);

        float a1, a2;

        System.out.print("Type a real number: ");
        a1 = input.nextFloat();
        System.out.print("Type another: ");
        a2 = input.nextFloat();

        System.out.printf("Sum: %.1f%n", a1 + a2);
        System.out.printf("Subtraction: %.1f%n", a1 - a2);
        System.out.printf("Product: %.1f%n", a1 * a2);
        System.out.printf("Division: %.1f%n", a1/a2);
    }
}
