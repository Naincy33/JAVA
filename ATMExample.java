
class BankAccount {

    int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;
    }
}

class ATM extends Thread {

    BankAccount account;
    int amount;

    ATM(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

public class ATMExample {

    public static void main(String[] args) throws Exception {

        BankAccount acc = new BankAccount();

        ATM atm1 = new ATM(acc, 500);
        ATM atm2 = new ATM(acc, 500);

        atm1.start();
        atm2.start();

        atm1.join();
        atm2.join();

        System.out.println("Final Balance: " + acc.balance);
    }
}


    