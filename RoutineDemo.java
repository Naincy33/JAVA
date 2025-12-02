// Interface definition

interface Routine {

    // default method
    default void diet() {
        System.out.println("2500 calories needed per day");
    }

    // unimplemented abstract method
    void workout();
}

// Person1 implementing Routine
class Person1 implements Routine {

    public void workout() {
        System.out.println("Person1 workout: Running for 30 minutes");
    }
}

// Person2 implementing Routine
class Person2 implements Routine {

    public void workout() {
        System.out.println("Person2 workout: Gym for 1 hour");
    }
}

// Main class
public class RoutineDemo {

    public static void main(String[] args) {

        Person1 p1 = new Person1();
        Person2 p2 = new Person2();

        System.out.println("For Person1:");
        p1.diet();         // default method
        p1.workout();      // overridden

        System.out.println("\nFor Person2:");
        p2.diet();
        p2.workout();
    }
}
