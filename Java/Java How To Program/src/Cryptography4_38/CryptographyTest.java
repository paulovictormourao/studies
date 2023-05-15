package Cryptography4_38;
import java.util.Scanner;


public class CryptographyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Type an number with 4 digits to encrypt: ");
        num = input.nextInt();

        Cryptography message = new Cryptography(num);


        System.out.println(message.getEncrypt());

    }
}
