/*Develop a Java program to create an abstract class named
Shape that contains two integers and an empty method
named printArea(). Provide three classes named Rectangle,
Triangle and Circle such that each one of the classes
extends the class Shape. Each one of the classes contain
only the method */
abstract class Shape {
    double area;

    abstract double printArea();

    void displayArea() {
        System.out.println("AREA IS: " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double printArea() {
        area = length * breadth;
        return area;
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double printArea() {
        area = 0.5 * base * height;
        return area;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double printArea() {
        area = 3.14 * radius * radius;
        return area;
    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(8, 10);
        Circle c = new Circle(21);

        r.printArea();
        r.displayArea();

        t.printArea();
        t.displayArea();

        c.printArea();
        c.displayArea();
    }
}