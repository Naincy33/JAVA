class DeliveryPartner extends Thread {

    private String partnerName;

    public DeliveryPartner(String partnerName) {
        this.partnerName = partnerName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(partnerName + " delivering order " + i);
            try {
                Thread.sleep(1000); // simulate time taken to deliver
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class delivery{
    public static void main(String[] args) {

        // Creating multiple threads
        DeliveryPartner p1 = new DeliveryPartner("Partner A");
        DeliveryPartner p2 = new DeliveryPartner("Partner B");
        DeliveryPartner p3 = new DeliveryPartner("Partner C");

        p1.start();
        p2.start();
        p3.start();


        
    }
}
