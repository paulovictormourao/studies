import java.security.SecureRandom;

public class RandomTest {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int value, i;
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0;

        for (i = 0; i < 6000000; i++){
            value = random.nextInt(6);

            switch (value) {
                case 0 -> f1++;
                case 1 -> f2++;
                case 2 -> f3++;
                case 3 -> f4++;
                case 4 -> f5++;
                default -> f6++;
            }
        }
        System.out.println("1: " + f1);
        System.out.println("2: " + f2);
        System.out.println("3: " + f3);
        System.out.println("4: " + f4);
        System.out.println("5: " + f5);
        System.out.println("6: " + f6);

    }
}
