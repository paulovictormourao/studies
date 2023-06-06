package Chapter_7_GradeBook;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(int[] grades, String courseName){

        this.courseName = courseName;
        this.grades = grades;

    }

    // Course name methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Grades[] methods
    public double getAverage(){
        int total = 0;
        for (int i : grades){
            total += i;
        }
        return (double) total /grades.length;
    }

    public int getMinimum(){
        int min = grades[0];

        for (int gradeI : grades){
            if (min < gradeI){
                min = gradeI;
            }

        }

        return min;
    }

    public int getMaximum(){
        int max = grades[0];

        for (int gradeI : grades){
            if (max > gradeI){
                max = gradeI;
            }

        }

        return max;
    }

    public void outputGrades(){

        System.out.println("STUDENTS GRADES: \n");

        for (int i = 0; i < grades.length; i++){

            System.out.printf("Student [%d]: %2d%n", i + 1, grades[i]);
        }
        System.out.println();
    }

    public void outputBarsChart(){
        int[] frequency = new int[11];

        for(int gradeI : grades){
            frequency[gradeI/10]++;
        }

        System.out.println();

        for (int i = 0; i < frequency.length; i++){
            if (i != 10 ) {
                if (i != 0) {
                    System.out.printf("%d - %d]: ", i * 10, (i * 10) + 9);
                }
                else {
                    System.out.printf("%2d - %2d]: ", 0, 9);
                }
            }

            else{
                System.out.printf("%7d]: ", i * 10);
            }

            for (int j = 0; j < frequency[i]; j++){
                System.out.print("-");
            }

            System.out.println();
        }
    }

    public void processGrades(){
        outputGrades();

        System.out.printf("The average is: %.2f%n", getAverage());

        System.out.println("The highest grade is: " + getMinimum());

        System.out.println("The lowest grade is: " + getMaximum());

        outputBarsChart();
    }
}
