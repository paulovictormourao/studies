import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, original, reverse = 0, aux;

        num = input.nextInt();
        original = num;

        while (num != 0){
            aux = num % 10;
            reverse = 10 * reverse + aux;
            num /= 10;
        }

        System.out.printf( "%d %s\n", original, (reverse == original) ? "is palindrome" : "is not a palindrome");

    }
}
