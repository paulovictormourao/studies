package Chapter_8_Employee;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Date birth = new Date(1949, Calendar.JULY, 24);
        Date hire = new Date(1988, Calendar.MARCH, 12);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
}
