import java.util.Scanner;

class Vehicle {
    // Non-static data members
    private String regNo;
    private double price;

    // Static data member
    static int count = 0;

    // Constructor — increments vehicle count
    Vehicle() {
        count++;
        System.out.println("Vehicle " + count + " created");
    }

    // Non-static method to set registration number and price
    void setRegNo(String regNo, double price) {
        this.regNo = regNo;
        this.price = price;
    }

    // Non-static method to get registration number
    String getRegNo() {
        return regNo;
    }

    // Method to get price
    double getPrice() {
        return price;
    }

    // Static method to get total number of vehicles
    static int getVehicleCount() {
        return count;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        // Create array of Vehicle objects
        Vehicle[] v = new Vehicle[n];

        // Input vehicle details
        for (int i = 0; i < n; i++) {
            v[i] = new Vehicle();
            System.out.print("Enter registration number for vehicle " + (i + 1) + ": ");
            String regNo = sc.next();
            System.out.print("Enter price for vehicle " + (i + 1) + ": ");
            double price = sc.nextDouble();
            v[i].setRegNo(regNo, price);
        }

        // Display total number of vehicles
        System.out.println("\nTotal number of vehicles: " + Vehicle.getVehicleCount());

        // Find the vehicle with the highest price
        double maxPrice = v[0].getPrice();
        String maxRegNo = v[0].getRegNo();

        for (int i = 1; i < n; i++) {
            if (v[i].getPrice() > maxPrice) {
                maxPrice = v[i].getPrice();
                maxRegNo = v[i].getRegNo();
            }
        }

        System.out.println("\nVehicle with the highest price:");
        System.out.println("Registration Number: " + maxRegNo);
        System.out.println("Price: " + maxPrice);

        sc.close();
    }
}
