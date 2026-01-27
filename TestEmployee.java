class InvalidSalaryException extends Exception {
    InvalidSalaryException(String msg) {
        super(msg);
    }
}

class InvalidTeamSizeException extends Exception {
    InvalidTeamSizeException(String msg) {
        super(msg);
    }
}

class Employee {
    double salary;

    Employee(double salary) throws InvalidSalaryException {
        if (salary <= 0)
            throw new InvalidSalaryException("Invalid Salary");
        this.salary = salary;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(double salary, int teamSize)
            throws InvalidSalaryException, InvalidTeamSizeException {

        super(salary);

        if (teamSize <= 1)
            throw new InvalidTeamSizeException("Invalid Team Size");

        this.teamSize = teamSize;
    }
}

public class TestEmployee {
    public static void main(String[] args) {

        try {
            Employee e = new Employee(30000);
            Manager m = new Manager(60000, 0);
            System.out.println("Employee & Manager created successfully");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
