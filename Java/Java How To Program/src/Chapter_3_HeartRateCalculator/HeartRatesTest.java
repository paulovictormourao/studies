package Chapter_3_HeartRateCalculator;
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name, surname;
        int day, month, year, maxRate;

        System.out.print("Type your name: ");
        name = input.nextLine();
        System.out.print("Type your surname: ");
        surname = input.nextLine();
        System.out.print("Type your the day of birth: ");
        day = input.nextInt();
        System.out.print("Type your the month of birth: ");
        month = input.nextInt();
        System.out.print("Type your the year of birth: ");
        year = input.nextInt();
        System.out.println();


        HeartRates person = new HeartRates(name, surname, day, month, year);

        System.out.printf("%s %s, %d%n", person.getName(), person.getSurname(), person.age());
        System.out.printf("%d/%d/%d%n",person.getBirthDay(), person.getBirthMonth(), person.getBirthYear());
        maxRate = person.maxHeartRate(person.age());
        System.out.printf("Max heart rate %d bpm %n", maxRate);

        person.goalHeartRate(maxRate);
    }


}
