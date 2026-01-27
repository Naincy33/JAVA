// Parent class
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

// Child class Manager
class Manager extends Employee {
    void work() {
        System.out.println("Manager is managing");
    }
}

// Child class Developer
class Developer extends Employee {
    void work() {
        System.out.println("Developer is coding");
    }
}

// Main class
public class polymorphism {
    public static void main(String[] args) {

        // Array of parent type
        Employee[] emp = new Employee[3];

        emp[0] = new Employee();
        emp[1] = new Manager();
        emp[2] = new Developer();

        // Polymorphism in action
        for (Employee e : emp) {
            e.work();
        }
    }
}
