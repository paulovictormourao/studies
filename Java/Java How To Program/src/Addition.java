/* Addition Of Two Terms With Scanner
Author: Paulo Victor Mourão
Last Modified on: 07/04/2023
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x1, x2, y;

        System.out.print("Type an int: ");
        x1 = input.nextInt();

        System.out.print("Type another: ");
        x2 = input.nextInt();

        y = x1 + x2;

        System.out.printf("The result is: %d", y);
    }
}
