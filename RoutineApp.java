// Interface
interface Routine {

    // default method
    default void diet() {
        System.out.println("2500 calories needed per day");
    }

    // abstract method
    void workout();
}

// Person1 class
class Person1 implements Routine {

    public void workout() {
        System.out.println("Person1 does yoga");
    }
}

// Person2 class
class Person2 implements Routine {

    public void workout() {
        System.out.println("Person2 does gym workout");
    }
}

// Main class
public class RoutineApp {
    public static void main(String[] args) {

        Routine p1 = new Person1();
        Routine p2 = new Person2();

        p1.diet();
        p1.workout();

        p2.diet();
        p2.workout();
    }
}
