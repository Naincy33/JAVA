// Abstract class Employee
abstract class Employee {
    int emp_ID;
    String emp_Name;
    double salary;

    // Constructor
    Employee(int emp_ID, String emp_Name) {
        this.emp_ID = emp_ID;
        this.emp_Name = emp_Name;
    }

    // Abstract method
    abstract void Cal_Salary();

    // Display method
    void displayDetails() {
        System.out.println("Employee ID: " + emp_ID);
        System.out.println("Employee Name: " + emp_Name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class for Permanent Employee
class Permanent_Emp extends Employee {
    double basicPay, houserent;

    // Constructor using super keyword
    Permanent_Emp(int emp_ID, String emp_Name, double basicPay, double houserent) {
        super(emp_ID, emp_Name); // Using super to call parent constructor
        this.basicPay = basicPay;
        this.houserent = houserent;
        
    }

    // Implement abstract method
    void Cal_Salary() {
        salary = basicPay + houserent ;
    }
}

// Derived class for Temporary Employee
class Temporary_Emp extends Employee {
    double hourlyRate;
    int hoursWorked;

    Temporary_Emp(int emp_ID, String emp_Name, double hourlyRate, int hoursWorked) {
        super(emp_ID, emp_Name); // Using super again
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement abstract method
    void Cal_Salary() {
        salary = hourlyRate * hoursWorked;
    }
}

// Main class to test the program
public class EmployeeDemo {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Employee emp; // Reference of abstract class

        emp = new Permanent_Emp(101, "Naincy", 20000, 5000);
        emp.Cal_Salary();
        System.out.println("Permanent Employee Details:");
        emp.displayDetails();

        System.out.println("\n---------------------------------\n");

        emp = new Temporary_Emp(102, "Choti", 300, 25);
        emp.Cal_Salary();
        System.out.println("Temporary Employee Details:");
        emp.displayDetails();
    }
}
