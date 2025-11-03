abstract class Account {
    protected String customerName;
    protected int accno;
    protected double balance;

    public Account(String customerName, int accno, double balance) {
        this.customerName = customerName;
        this.accno = accno;
        this.balance = balance;
    }

    public abstract void displayAccountDetails();

    public abstract void withdraw(double amount);
}

class SavingAccount extends Account {
    private double interestRate = 0.5;

    SavingAccount(String customerName, int accno, double balance) {
        super(customerName, accno, balance);
    }

    public void computeCompoundInterest(int years) {
        double amount = balance * Math.pow((1 + interestRate), years);
        double interest = amount - balance;
        balance = amount;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account - " + customerName + " | Acc No: " + accno + " | Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    private final double minimumBalance = 1000.0;
    private final double serviceCharge = 100.0;

    CurrentAccount(String customerName, int accno, double balance) {
        super(customerName, accno, balance);
    }

    public void issueChequeBook() {
        System.out.println("Cheque book issued to " + customerName);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Balance below minimum. Service charge of " + serviceCharge + " imposed.");
            }
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account - " + customerName + " | Acc No: " + accno + " | Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("Alice", 1001, 5000);
        sa.displayAccountDetails();
        sa.computeCompoundInterest(2);
        sa.withdraw(1000);
        sa.displayAccountDetails();

        CurrentAccount ca = new CurrentAccount("BOB", 2001, 1500);
        ca.displayAccountDetails();
        ca.issueChequeBook();
        ca.withdraw(500);
        ca.displayAccountDetails();
    }
}

