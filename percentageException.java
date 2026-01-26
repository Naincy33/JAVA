// User defined exception
class NotEligibleException extends Exception {
    NotEligibleException(String msg) {
        super(msg);
    }
}

// Student class
class Student {
    String usn;
    String name;
    int sem;
    double percentage;

    // Constructor
    Student(String usn, String name, int sem, double percentage) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
        this.percentage = percentage;
    }

    // Method to calculate result
    void calculateResult() throws NotEligibleException {

        if (percentage < 40) {
            throw new NotEligibleException("Not Eligible: Percentage less than 40");
        } else if (percentage >= 80) {
            System.out.println("Distinction");
        } else if (percentage >= 60) {
            System.out.println("First Class");
        } else {
            System.out.println("Second Class");
        }
    }
}

// Main class
public class percentageException {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("1RV21CS001", "Amit", 3, 85);
            s1.calculateResult();

            Student s2 = new Student("1RV21CS002", "Ravi", 3, 35);
            s2.calculateResult();
        }
        catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
