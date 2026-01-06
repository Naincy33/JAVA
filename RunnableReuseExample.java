class NumberPrinter implements Runnable {

    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
            try {
                Thread.sleep(300); // slow it down a bit
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class RunnableReuseExample {
    public static void main(String[] args) {

        // Create 3 reusable tasks with different ranges
        Runnable task1 = new NumberPrinter(1, 5);
        Runnable task2 = new NumberPrinter(6, 10);
        Runnable task3 = new NumberPrinter(11, 15);

        // Create and start threads
        Thread t1 = new Thread(task1, "Printer-1");
        Thread t2 = new Thread(task2, "Printer-2");
        Thread t3 = new Thread(task3, "Printer-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
