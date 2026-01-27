import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}
public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            System.out.println("Enter amount to withdraw:");
            String input = sc.next();

            double amount = Double.parseDouble(input);

            if (amount <= 0)
                throw new IllegalArgumentException("Invalid amount");

            if (amount > balance)
                throw new InsufficientFundsException("Insufficient balance");

            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        catch (NumberFormatException e) {
            System.out.println("Input must be a number");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction attempt completed");
        }
    }
}
