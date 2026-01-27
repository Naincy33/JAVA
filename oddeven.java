
class PrintNumber {

    int num = 1;
    boolean isOdd = true;

    synchronized void printOdd() {
        while (num <= 10) {
            if (!isOdd) {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            System.out.println("Odd: " + num);
            num++;
            isOdd = false;
            notify();
        }
    }

    synchronized void printEven() {
        while (num <= 10) {
            if (isOdd) {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            System.out.println("Even: " + num);
            num++;
            isOdd = true;
            notify();
        }
    }
}

public class oddeven {

    public static void main(String[] args) {

        PrintNumber p = new PrintNumber();

        Thread t1 = new Thread(() -> p.printOdd());
        Thread t2 = new Thread(() -> p.printEven());

        t1.start();
        t2.start();
    }
}
