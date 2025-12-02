// Interface with abstract and static methods
interface CurrencyConverter {
    void billAmount(double amountInDollars);

    // Static utility method
    static double dollarToInr(double amount) {
        return amount * 83;  // 1 USD = 83 INR
    }
}

// Billing class implementing the interface
class Bill implements CurrencyConverter {

    public void billAmount(double amountInDollars) {
        double amountInInr = CurrencyConverter.dollarToInr(amountInDollars);
        System.out.println("Bill Amount in INR: " + amountInInr);
    }
}

public class BillingSystem {
    public static void main(String[] args) {

        // Calling static method using interface name
        double converted = CurrencyConverter.dollarToInr(10);
        System.out.println("10 USD in INR: " + converted);

        // Using implementing class
        Bill bill = new Bill();
        bill.billAmount(25); // 25 USD converted to INR
    }
}
