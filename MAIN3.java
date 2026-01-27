class CountdownTask implements Runnable {

    Thread t;

    // Constructor: creates and starts thread
    CountdownTask(String name) {
        t = new Thread(this, name); // passing this + thread name
        t.start();
    }

    // run() method
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class MAIN3 {
    public static void main(String[] args) throws Exception {

        // Create three Runnable objects (three threads)
        CountdownTask c1 = new CountdownTask("Thread-1");
        CountdownTask c2 = new CountdownTask("Thread-2");
        CountdownTask c3 = new CountdownTask("Thread-3");

        // Check alive status before join
        System.out.println("Thread-1 alive? " + c1.t.isAlive());
        System.out.println("Thread-2 alive? " + c2.t.isAlive());
        System.out.println("Thread-3 alive? " + c3.t.isAlive());

        // Main thread waits for all threads
        c1.t.join();
        c2.t.join();
        c3.t.join();

        // After completion
        System.out.println("Thread-1 alive after join? " + c1.t.isAlive());
        System.out.println("Thread-2 alive after join? " + c2.t.isAlive());
        System.out.println("Thread-3 alive after join? " + c3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}
