// Child thread class
class ReverseThread extends Thread {

    String input;
    String reversed = "";

    ReverseThread(String input) {
        this.input = input;
    }

    public void run() {
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
    }
}

// Main class
public class reversed {
    public static void main(String[] args) {

        ReverseThread t = new ReverseThread("Hello Java");
        t.start();   // start child thread

        try {
            t.join();  // main thread waits for child thread
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // after child thread finishes
        System.out.println("Reversed String: " + t.reversed);
    }
}
