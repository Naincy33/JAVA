interface BankUtility {
    static double calculateInterest(double amount, double rate, int years) {
        return (amount * rate * years) / 100;
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void displayInterest(double rate, int years) {
        double interest = BankUtility.calculateInterest(balance, rate, years);
        System.out.println("Customer Name: " + name);
        System.out.println("Deposit Amount: " + balance);
        System.out.println("Interest for " + years + " years at " + rate + "%: " + interest);
    }
}

public class staticinterface {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ravi", 100000);
        c1.displayInterest(5, 3);
    }
}
