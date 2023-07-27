package Chapter_8_throw;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time1 time = new Time1();
        Scanner input = new Scanner(System.in);
        boolean looping;


         do {

            int h = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();

            try {
                time.setTime(h, m, s);
                looping = false;
            } catch (IllegalArgumentException e) {
                System.out.printf("%s\n", e.getMessage());
                looping = true;
            }

        }while (looping);

        time.toUniversalString();

    }
}
