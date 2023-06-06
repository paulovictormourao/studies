package Chapter_4_Cryptography;
import java.util.Scanner;


public class CryptographyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, encrypted;

        System.out.print("Type an number with 4 digits to encrypt: ");
        num = input.nextInt();

        Cryptography message = new Cryptography(num);
        encrypted = message.getEncrypt();

        System.out.println(encrypted);
        System.out.println(message.decrypt(encrypted));

    }
}
