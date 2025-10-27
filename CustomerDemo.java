import java.util.Scanner;

// Base class
class Customer {
    int customer_no;
    String customer_name;
    double billamount;
    int no_discountcoupons;

    // Parameterized constructor
    Customer(int no, String name, double bill) {
        customer_no = no;
        customer_name = name;
        billamount = bill;
        no_discountcoupons = 0; // default
    }

    // Method to display basic info
    void display() {
        System.out.println("\nCustomer No: " + customer_no);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Bill Amount: Rs. " + billamount);
        System.out.println("No. of Discount Coupons: " + no_discountcoupons);
    }
}

// Subclass 1 → RegularCustomer
class RegularCustomer extends Customer {
    double discount;
    double netprice;

    RegularCustomer(int no, String name, double bill, int coupons) {
        super(no, name, bill);
        no_discountcoupons = coupons;
    }

    // Method to calculate discount
    void calDiscount() {
        discount = no_discountcoupons * 50;  // Rs.50 per coupon
        netprice = billamount - discount;
        if (netprice < 0) netprice = 0;
    }

    // Display details
    void displayDetails() {
        display();
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Net Price: Rs. " + netprice);
    }
}

// Subclass 2 → NewCustomer
class NewCustomer extends Customer {
    NewCustomer(int no, String name, double bill) {
        super(no, name, bill);
    }

    // Method to calculate and set coupons
    void setCoupons() {
        no_discountcoupons = (int)(billamount / 500) * 1; // 1 coupon per 500 Rs
    }

    // Display details
    void displayDetails() {
        display();
    }
}

// Main class
public class CustomerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Regular Customers: ");
        int n = sc.nextInt();
        RegularCustomer[] rc = new RegularCustomer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Regular Customer " + (i + 1));
            System.out.print("Customer No: ");
            int no = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Bill Amount: ");
            double bill = sc.nextDouble();
            System.out.print("No. of Discount Coupons: ");
            int coupons = sc.nextInt();

            rc[i] = new RegularCustomer(no, name, bill, coupons);
            rc[i].calDiscount();
        }

        System.out.print("\nEnter number of New Customers: ");
        int m = sc.nextInt();
        NewCustomer[] nc = new NewCustomer[m];

        for (int i = 0; i < m; i++) {
            System.out.println("\nEnter details for New Customer " + (i + 1));
            System.out.print("Customer No: ");
            int no = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Bill Amount: ");
            double bill = sc.nextDouble();

            nc[i] = new NewCustomer(no, name, bill);
            nc[i].setCoupons();
        }

        // Display Results
        System.out.println("\n===== REGULAR CUSTOMERS =====");
        for (RegularCustomer c : rc) {
            c.displayDetails();
        }

        System.out.println("\n===== NEW CUSTOMERS =====");
        for (NewCustomer c : nc) {
            c.displayDetails();
        }

        sc.close();
    }
}
