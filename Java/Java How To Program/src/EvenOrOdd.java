/* Verify if an int number is even or odd.
Author: Paulo Victor Mourão
Last Modified on: 07/04/2023
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Type an int: ");
        x = input.nextInt();

        if ( x % 2 == 0){
            System.out.printf("%d is even%n", x);
        }
        else{
            System.out.printf("%d is odd%n", x);
        }
    }
}
