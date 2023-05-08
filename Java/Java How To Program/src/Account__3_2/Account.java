package Account__3_2;


public class Account {
    // Define Attributes
    private final String name;
    private Double balance;

    // Constructor
    public Account(String name, Double balance){
        this.name = name;
        if (balance >= 0){
            this.balance = balance;
        }
    }

    //Public methods
    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit (Double value){
        if (value > 0){
            balance += value;
        }
    }
    public void buy (Double value){
        if ( (value > 0) && (value < this.balance)){
            balance -= value;
        }
    }
    public void displayAccount(){
        System.out.printf("Your actual balance is: $%.2f Mr.%s%n%n", getBalance(), getName());
    }

}
