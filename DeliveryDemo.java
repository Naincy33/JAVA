class Partner extends Thread {
    String name;

    Partner(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(name + " delivering order...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
    }
}

public class DeliveryDemo {
    public static void main(String[] args) {
        Partner p1 = new Partner("Partner A");
        Partner p2 = new Partner("Partner B");
        Partner p3 = new Partner("Partner C");

        p1.start();
        p2.start();
        p3.start();
    }
}
