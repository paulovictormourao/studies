package Chapter_3_Account;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("James A. Lambda", 300.00);
        Account account2 = new Account("James B. Gama", 276.51);
        int aux;
        double depositValue;

        // Print basic info
        myAccount.displayAccount();
        account2.displayAccount();

        // Asks if Mr. Lambda wants to pay a bill
        System.out.printf("Mr.%s if you want to buy a $200 tax bill, type 1, if not type 0: ",myAccount.getName());
        aux = input.nextInt();

        if (aux == 1){
            myAccount.buy(200.00);
        }

        myAccount.displayAccount();


        // Asks if Mr. Gama wants to make a deposit
        System.out.printf("Mr.%s, if you want to make deposit, type the value, if not type 0: ", account2.getName());
        depositValue = input.nextDouble();

        if (aux == 1) {
            account2.deposit(depositValue);
        }

        account2.displayAccount();
    }
}