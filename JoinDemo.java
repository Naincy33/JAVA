class MyThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Worker: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Is t1 alive? " + t1.isAlive());

        t1.join();

        System.out.println("Is t1 alive after join? " + t1.isAlive());
        System.out.println("Main thread ends");
    }
}
