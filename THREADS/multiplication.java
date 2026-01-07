package THREADS;

class Table6 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("6 x " + i + " = " + (6 * i));
            try {
                Thread.sleep(500); // delay to show concurrency
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Table9 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " = " + (9 * i));
            try {
                Thread.sleep(500); // delay to show concurrency
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiplication {
    public static void main(String[] args) {

        Table6 t1 = new Table6();
        Table9 t2 = new Table9();

        t1.start();   // start first thread
        t2.start();   // start second thread
    }
}
