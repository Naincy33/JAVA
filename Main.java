class Super1 {
    Super1() {
        System.out.println("Inside Super1 default constructor");
    }
}

class Sub1 extends Super1 {
    Sub1() {
        System.out.println("Inside Sub1 default constructor");
    }
}

class Sub11 extends Sub1 {
    Sub11() {
        System.out.println("Inside Sub11 default constructor");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Super1 created");
        new Super1();

        System.out.println("Sub1 created");
        new Sub1();

        System.out.println("Sub11 created");
        new Sub11();
    }
}
