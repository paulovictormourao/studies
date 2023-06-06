package Chapter_7_GradeBook;
import java.security.SecureRandom;

public class TestGradeBook {
    public static void main(String[] args) {


        SecureRandom randomInt = new SecureRandom();

        final int LENLIST = 90;
        int[] grades = new int[LENLIST];


        for (int i = 0; i < grades.length; i++){

            grades[i] = randomInt.nextInt(100 + 1);

        }

        GradeBook randomTest = new GradeBook(grades, "MATH");

        System.out.printf("%n%nINFORMATION ABOUT THE  %s TEST %n%n", randomTest.getCourseName());
        randomTest.processGrades();

    }

}
