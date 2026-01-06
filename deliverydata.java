
class DataLoader extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loading data: " + i);
            try {
                Thread.sleep(1000); // simulate file loading delay
            } catch (InterruptedException e) {
                System.out.println("DataLoader interrupted.");
            }
        }
        System.out.println("Data loading completed.");
    }
}

public class deliverydata {

    public static void main(String[] args) {

        DataLoader loader = new DataLoader();

        // Check before start
        System.out.println("Is DataLoader alive before start? " + loader.isAlive());

        // Start the thread
        loader.start();

        // Check after start
        System.out.println("Is DataLoader alive after start? " + loader.isAlive());

        try {
            // Main thread waits until DataLoader finishes
            loader.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check after join
        System.out.println("Is DataLoader alive after join? " + loader.isAlive());

        System.out.println("Main program can continue after data loading is finished.");
    }
}
