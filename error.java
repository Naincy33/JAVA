import java.util.Scanner;

public class error {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above to vote");
        }
        System.out.println("Registration Successful! You are eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Registration Failed: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
