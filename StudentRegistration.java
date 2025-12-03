/*You are building a simple student registration system.
A student must provide their name and age to register.
If the age entered is negative or zero, the system should throw and handle an exception.
Regardless of the input, the system should always print:
"Registration attempt completed"
Write a Java program using try, catch, and finally to implement this. */

import java.util.*;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentRegistration {

    static void registerstudent(String name, int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be greather than zero .");
        }
        System.out.println("Student " + name + " registration successfulyy!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter name of student: ");
            String name = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            registerstudent(name, age);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error" + e.getMessage());
        } finally {
            System.out.println("Registration completed successfully!");
            scanner.close();
        }
    }
}
