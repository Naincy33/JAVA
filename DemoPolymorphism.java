// Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Developer subclass
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);   // call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Tester subclass
class Tester extends Employee {
    String testingTool;

    Tester(String name, double salary, String testingTool) {
        super(name, salary);
        this.testingTool = testingTool;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Testing Tool: " + testingTool);
    }
}

// Manager subclass
class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}

// Main class
public class DemoPolymorphism {
    public static void main(String[] args) {

        // Polymorphism using parent reference
        Employee[] employees = new Employee[3];

        employees[0] = new Developer("Amit", 60000, "Java");
        employees[1] = new Tester("Riya", 45000, "Selenium");
        employees[2] = new Manager("Rahul", 80000, 15000);

        /*for (Employee e : employees) {
            System.out.println("---- Employee Details ----");
            e.displayDetails();   // runtime polymorphism
            */
        for (int i = 0; i < employees.length; i++) {
            System.out.println("---- Employee Details ----");
            employees[i].displayDetails();   // runtime polymorphism
            
        }
    }
}
