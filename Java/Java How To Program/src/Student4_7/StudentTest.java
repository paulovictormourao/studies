package Student4_7;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int gradeNumber, studentNumber, countStudents = 0, countGrades = 0;
        double currentNote;


        System.out.print("Type the number of students: ");
        studentNumber = input.nextInt();

        System.out.print("Type the number of grades: ");
        gradeNumber = input.nextInt();


        while (countStudents < studentNumber) {
            String name;
            double average, total = 0;


            System.out.print("Student name: ");
            name = input.next();

            System.out.printf("Type %s's grades:%n", name);

            while (countGrades < gradeNumber) {
                currentNote = input.nextInt();
                total += currentNote;

                countGrades++;
            }
            countGrades = 0;

            average = total/gradeNumber;
            Student student = new Student(name, average);

            System.out.printf("%s's average grade is %s%n", student.getName(), student.getLetterGrade());

            countStudents++;
        }


    }
}
