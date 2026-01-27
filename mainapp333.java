class BankAccount {

    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method that takes another object as parameter
    void deposit(BankAccount receiver, double amount) {

        if (this.balance >= amount) {
            this.balance = this.balance - amount;   // sender
            receiver.balance = receiver.balance + amount; // receiver
            System.out.println("Transfer successful: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display details
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class mainapp333 {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Amit", 5000);
        BankAccount acc2 = new BankAccount("Ravi", 3000);

        System.out.println("Before Transaction:");
        acc1.display();
        acc2.display();

        // object passed as parameter
        acc1.deposit(acc2, 2000);

        System.out.println("\nAfter Transaction:");
        acc1.display();
        acc2.display();
    }
}
