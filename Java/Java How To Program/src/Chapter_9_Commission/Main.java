package Chapter_9_Commission;

public class Main {
    public static void main(String[] args) {
        BasePlus basePlusCommissionEmployee =
         new BasePlus("Bob", "Lewis", "333-33-3333",
                 5000, .04, 300);

        System.out.printf(basePlusCommissionEmployee.toString());
    }

}
