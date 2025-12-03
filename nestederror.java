import java.util.Scanner;

class Bank {
    int balance = 5000;

    void withdraw(int amount) throws ArithmeticException {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }
}

public class nestederror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank account = new Bank();

        try {
            System.out.print("Enter your account number: ");
            int accNo = sc.nextInt();  // User input for account

            try {
                if (accNo != 100) {   // Only 100 is considered valid
                    throw new Exception("Invalid account number!");
                }

                System.out.print("Enter amount to withdraw: ");
                int amount = sc.nextInt();  // User input for withdrawal

                account.withdraw(amount);

            } catch (ArithmeticException e) {
                System.out.println("Withdrawal Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Account Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction ended.");
            sc.close();
        }
    }
}
