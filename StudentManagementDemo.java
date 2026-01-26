// 1️⃣ Final class with constant school name
final class School {
    public static final String SCHOOL_NAME = "Green Valley Public School";
}

// 2️⃣ Student class with final roll number
class Student {
    private final int rollNumber;   // cannot be changed
    private String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("School Name : " + School.SCHOOL_NAME);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Student Name: " + name);
    }
}

// 3️⃣ GradingSystem with final method
class GradingSystem {

    final char calculateGrade(int marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }
}

// 4️⃣ Attempt to override final method (will cause ERROR)
// Uncomment to see compile-time error
/*
class CustomGradingSystem extends GradingSystem {

    @Override
    char calculateGrade(int marks) {
        return 'A';
    }
}
*/

// 5️⃣ Main class
public class StudentManagementDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Aarav");
        s1.displayDetails();

        System.out.println("----------------------");

        GradingSystem gs = new GradingSystem();
        int marks = 82;

        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + gs.calculateGrade(marks));
    }
}
