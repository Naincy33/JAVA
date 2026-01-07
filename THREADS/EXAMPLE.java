package THREADS;

class Message {

    synchronized void write() {
        System.out.println("Writer is writing message");
        notify();   // wake up reader
    }

    synchronized void read() {
        try {
            wait(); // wait for writer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reader is reading message");
    }
}

class Writer extends Thread {
    Message m;

    Writer(Message m) {
        this.m = m;
    }

    public void run() {
        m.write();
    }
}

class Reader extends Thread {
    Message m;

    Reader(Message m) {
        this.m = m;
    }

    public void run() {
        m.read();
    }
}

public class EXAMPLE {
    public static void main(String[] args) {

        Message m = new Message();

        Reader r = new Reader(m);
        Writer w = new Writer(m);

        r.start();   // reader waits
        w.start();   // writer notifies
    }
}
