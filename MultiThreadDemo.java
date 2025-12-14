// Thread A extending Thread class
class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A - Count: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        }
    }
}

// Thread B extending Thread class
class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B - Count: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread B interrupted");
            }
        }
    }
}

// Runnable C implementing Runnable interface
class RunnableC implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable C - Count: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Runnable C interrupted");
            }
        }
    }
}

// Main class
public class MultiThreadDemo {
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        Thread t3 = new Thread(new RunnableC());

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
