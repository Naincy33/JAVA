// Bank Interface
interface Bank {
    double interestRate(); 
    double calculateMaturityAmount(double principle, int years);
    String IFSCCode();
    String address();
}

// BankA Class
class BankA implements Bank {
    public double interestRate() {
        return 6.5;
    }
    public double calculateMaturityAmount(double principle, int years) {
        return principle + (principle * interestRate() * years) / 100;
    }
    public String IFSCCode() {
        return "BANKA1234";
    }
    public String address() {
        return "BankA, MG Road, Bangalore";
    }
}

// BankB Class
class BankB implements Bank {
    public double interestRate() {
        return 7.2;
    }
    public double calculateMaturityAmount(double principle, int years) {
        return principle + (principle * interestRate() * years) / 100;
    }
    public String IFSCCode() {
        return "BANKB5678";
    }
    public String address() {
        return "BankB, Gandhi Nagar, Delhi";
    }
}

// BankC Class
class BankC implements Bank {
    public double interestRate() {
        return 8.1;
    }
    public double calculateMaturityAmount(double principle, int years) {
        return principle + (principle * interestRate() * years) / 100;
    }
    public String IFSCCode() {
        return "BANKC9876";
    }
    public String address() {
        return "BankC, Park Street, Kolkata";
    }
}

// Main Class
public class BankInterface {
    public static void main(String[] args) {

        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();

        System.out.println("-----Bank A-----");
        System.out.println("IFSC: " + b1.IFSCCode());
        System.out.println("Address: " + b1.address());
        System.out.println("Maturity Amount: " + b1.calculateMaturityAmount(10000, 5));

        System.out.println("\n-----Bank B-----");
        System.out.println("IFSC: " + b2.IFSCCode());
        System.out.println("Address: " + b2.address());
        System.out.println("Maturity Amount: " + b2.calculateMaturityAmount(10000, 5));

        System.out.println("\n-----Bank C-----");
        System.out.println("IFSC: " + b3.IFSCCode());
        System.out.println("Address: " + b3.address());
        System.out.println("Maturity Amount: " + b3.calculateMaturityAmount(10000, 5));
    }
}
