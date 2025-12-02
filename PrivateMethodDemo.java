interface Display {

    default void showWelcome() {
        String message = getMessage("Welcome");
        System.out.println(message);
    }

    default void showGoodbye() {
        String message = getMessage("Goodbye");
        System.out.println(message);
    }

    // Private helper method (only accessible inside this interface)
    private String getMessage(String text) {
        return text + " to Java Interface Example!";
    }
}

class Demo implements Display {
    // No need to override anything
}

public class PrivateMethodDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.showWelcome();
        d.showGoodbye();
    }
}
