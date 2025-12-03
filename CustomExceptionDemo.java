class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void withdraw(String accountNumber, double balance, double amount)
            throws InsufficientBalanceException {

        if (!accountNumber.equals("12345")) {
            throw new InvalidAccountException("Invalid account number!");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        System.out.println("Withdrawal successful!");
    }

    public static void main(String[] args) {
        try {
            withdraw("99999", 5000, 1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
