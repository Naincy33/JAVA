// Parent class
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
        System.out.println("BankAccount constructor called");
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);   // calls parent constructor
        this.interestRate = interestRate;
        System.out.println("SavingsAccount constructor called");
    }

    // overriding parent method
    @Override
    void displayDetails() {
        super.displayDetails(); // calls parent method
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    void showParentBalance() {
        System.out.println("Accessing balance using super: " + super.balance);
    }
}

// Main class
public class DemoSuper {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Ram", 50000, 5.5);

        acc.displayDetails();
        acc.showParentBalance();
    }
}
