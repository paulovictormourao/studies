package Chapter_9_Commission;

public class BasePlus extends CommissionEmployee{

    private double baseSalary;

    public BasePlus(String firstName, String lastName, String socialSecurityNumber,
                    double grossSales, double commissionRate, double baseSalary){

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s \nbase: %.2f", super.toString(), getBaseSalary());

    }
}
