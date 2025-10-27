// Abstract class
abstract class Calculate {
    double x, y, result;

    // Constructor to initialize x and y
    Calculate(double a, double b) {
        x = a;
        y = b;
    }

    // Abstract method
    abstract void calc();

    // Method to display the result
    void display() {
        System.out.println("Result: " + result);
    }
}

// Subclass 1 - Addition
class Add extends Calculate {
    Add(double a, double b) {
        super(a, b);
    }

    void calc() {
        result = x + y;
        System.out.println("Addition of " + x + " and " + y + " = " + result);
    }
}

// Subclass 2 - Subtraction
class Subtract extends Calculate {
    Subtract(double a, double b) {
        super(a, b);
    }

    void calc() {
        result = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " = " + result);
    }
}

// Subclass 3 - Multiplication
class Multiply extends Calculate {
    Multiply(double a, double b) {
        super(a, b);
    }

    void calc() {
        result = x * y;
        System.out.println("Multiplication of " + x + " and " + y + " = " + result);
    }
}

// Main class
public class CalcDemo {
    public static void main(String[] args) {
        Add a1 = new Add(10, 5);
        a1.calc();

        Subtract s1 = new Subtract(10, 5);
        s1.calc();

        Multiply m1 = new Multiply(10, 5);
        m1.calc();
    }
}
