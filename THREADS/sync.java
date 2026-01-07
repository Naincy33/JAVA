package THREADS;

class Display {

    void print(String msg) {
        synchronized (this) {     // synchronized block
            System.out.println(msg);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String message;

    MyThread(Display d, String message) {
        this.d = d;
        this.message = message;
    }

    public void run() {
        d.print(message);
    }
}

public class sync {
    public static void main(String[] args) {

        Display d = new Display();

        MyThread t1 = new MyThread(d, "HELLO");
        MyThread t2 = new MyThread(d, "SYNCHRONIZED");
        MyThread t3 = new MyThread(d, "WORLD");

        t1.start();
        t2.start();
        t3.start();
    }
}
