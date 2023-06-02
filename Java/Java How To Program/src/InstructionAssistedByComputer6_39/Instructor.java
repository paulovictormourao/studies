package InstructionAssistedByComputer6_39;

import java.security.SecureRandom;
import java.util.Scanner;

public class Instructor {

    static Scanner input = new Scanner(System.in);
    static SecureRandom randomInt = new SecureRandom();



    public static int makeQuestion(){
        int n1 = randomInt.nextInt(10) + 1;
        int n2 = randomInt.nextInt(10) + 1;

        System.out.printf("What is %d times %d? ", n1, n2);

        return n1 * n2;
    }

    public static boolean verify (int x){

        int answer = input.nextInt();


        return answer == x;
    }

    public static void messages(int num, String str1, String str2,
                     String str3, String str4           ){

        switch (num % 4){
            case (0):
                System.out.println(str1);
                break;
            case (1):
                System.out.println(str2);
                break;
            case (2):
                System.out.println(str3);
                break;
            default:
                System.out.println(str4);

        }
    }

    public static void loop(){
        int errors = 0, points = 0;

        while (true){

            int x = makeQuestion();


            while ( !verify(x) ) {



                messages(errors, "no, please, try again: ","wrong, try once ",
                        "wrong, but don't give up ", "wrong.. keep trying!! ");
                errors++;


            }

            messages(points,"well done", "congratulations", "very good", "amazing");
            points++;

            if( (errors + points) % 10 == 0 ){
                System.out.printf("your score rate is: %d%% %n", points * 100/ (errors + points) );

                if (points * 100 / (errors + points) >= 75){
                    System.out.println("congratulations, now you can let other student play");
                    points = 0;
                    errors = 0;
                }

                else System.out.println("well, you should ask your teacher for help");

            }



        }
    }

}
