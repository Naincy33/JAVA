class Student {

    static int totalStudents = 0;   // static variable
    final int rollNo;               // final variable
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;       // assigned only once
        this.name = name;
        totalStudents++;            // count students
    }

    // Display student details
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // static method
    static void showTotalStudents() {
        System.out.println("Total Students = " + totalStudents);
    }
}

public class studentapp {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(102, "Ravi");
        Student s3 = new Student(103, "Neha");

        s1.display();
        s2.display();
        s3.display();

        Student.showTotalStudents(); // static method call
    }
}
