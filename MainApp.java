
abstract class Calculate {

    double x, y, result;

    // Constructor in abstract class
    Calculate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method
    abstract void calc();
}

// Addition
class Add extends Calculate {

    Add(double x, double y) {
        super(x, y);
    }

    void calc() {
        result = x + y;
        System.out.println("Addition = " + result);
    }
}

// Subtraction
class Subtract extends Calculate {

    Subtract(double x, double y) {
        super(x, y);
    }

    void calc() {
        result = x - y;
        System.out.println("Subtraction = " + result);
    }
}

// Multiplication
class Multiply extends Calculate {

    Multiply(double x, double y) {
        super(x, y);
    }

    void calc() {
        result = x * y;
        System.out.println("Multiplication = " + result);
    }
}

// Main class
public class MainApp {

    public static void main(String[] args) {

        Calculate c1 = new Add(10, 5);
        Calculate c2 = new Subtract(10, 5);
        Calculate c3 = new Multiply(10, 5);

        c1.calc();
        c2.calc();
        c3.calc();
    }
}
