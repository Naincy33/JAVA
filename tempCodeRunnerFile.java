
interface BankAccount {

    default void calculateInterest() {
        System.out.println("Calculating interest for account...");
    }
}

class SavingsAccount implements BankAccount {

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account: Interest calculated at 4.5% per annum.");
    }
}

class CurrentAccount implements BankAccount {
    // uses the default method
}

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        sa.calculateInterest(); // calls overridden method
        ca.calculateInterest(); // calls default method
    }
}