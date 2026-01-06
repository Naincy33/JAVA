class CountdownTask implements Runnable {

    Thread t;

    // Constructor creates & starts the thread
    CountdownTask(String name) {
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class countdown {
    public static void main(String[] args) {

        // Create three Runnable objects (threads start in constructor)
        CountdownTask t1 = new CountdownTask("Thread-1");
        CountdownTask t2 = new CountdownTask("Thread-2");
        CountdownTask t3 = new CountdownTask("Thread-3");

        // Check alive status before join
        System.out.println("Thread-1 alive? " + t1.t.isAlive());
        System.out.println("Thread-2 alive? " + t2.t.isAlive());
        System.out.println("Thread-3 alive? " + t3.t.isAlive());

        try {
            // Main thread waits for all threads to finish
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check alive status after join
        System.out.println("Thread-1 alive after join? " + t1.t.isAlive());
        System.out.println("Thread-2 alive after join? " + t2.t.isAlive());
        System.out.println("Thread-3 alive after join? " + t3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}
