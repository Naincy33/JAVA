class BankAccount {

    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to transfer money (object as parameter)
    void deposit(BankAccount receiver, double amount) {

        if (balance >= amount) {
            this.balance -= amount;     // sender balance decrease
            receiver.balance += amount; // receiver balance increase
            System.out.println("Transfer Successful: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display account details
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class MainApp1 {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Amit", 5000);
        BankAccount acc2 = new BankAccount("Ravi", 3000);

        System.out.println("Before Transaction:");
        acc1.display();
        acc2.display();

        acc1.deposit(acc2, 2000);   // object passed as parameter

        System.out.println("\nAfter Transaction:");
        acc1.display();
        acc2.display();
    }
}
