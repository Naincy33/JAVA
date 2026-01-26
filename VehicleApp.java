// Base class
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Methods to be overridden
    double fuelEfficiency() {
        return 0;
    }

    double distanceTraveled(double fuelUsed) {
        return fuelUsed * fuelEfficiency();
    }

    int maxSpeed() {
        return 0;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Truck class
class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double fuelEfficiency() {
        return 8; // km per litre
    }

    int maxSpeed() {
        return 100;
    }
}

// Car class
class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double fuelEfficiency() {
        return 18; // km per litre
    }

    int maxSpeed() {
        return 160;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double fuelEfficiency() {
        return 35; // km per litre
    }

    int maxSpeed() {
        return 180;
    }
}

// Main class
public class VehicleApp {
    public static void main(String[] args) {

        Vehicle v1 = new Truck("Tata", "407", 2020, "Diesel");
        Vehicle v2 = new Car("Honda", "City", 2022, "Petrol");
        Vehicle v3 = new Motorcycle("Yamaha", "R15", 2023, "Petrol");

        System.out.println("---- Truck ----");
        v1.display();
        System.out.println("Fuel Efficiency: " + v1.fuelEfficiency());
        System.out.println("Distance (10L): " + v1.distanceTraveled(10));
        System.out.println("Max Speed: " + v1.maxSpeed());

        System.out.println("\n---- Car ----");
        v2.display();
        System.out.println("Fuel Efficiency: " + v2.fuelEfficiency());
        System.out.println("Distance (10L): " + v2.distanceTraveled(10));
        System.out.println("Max Speed: " + v2.maxSpeed());

        System.out.println("\n---- Motorcycle ----");
        v3.display();
        System.out.println("Fuel Efficiency: " + v3.fuelEfficiency());
        System.out.println("Distance (10L): " + v3.distanceTraveled(10));
        System.out.println("Max Speed: " + v3.maxSpeed());
    }
}
