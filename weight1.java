class Weight {
    int kg;
    int gm;

    // Constructor
    Weight(int kg, int gm) {
        this.kg = kg;
        this.gm = gm;
    }

    // Method to add two Weight objects and store result in current object
    void add(Weight w1, Weight w2) {
        kg = w1.kg + w2.kg;
        gm = w1.gm + w2.gm;

        // Adjust grams if >= 1000
        if (gm >= 1000) {
            kg += gm / 1000;
            gm = gm % 1000;
        }
    }

    // Method to display weight
    void display() {
        System.out.println("Total weight = " + kg + " kg " + gm + " gm");
    }
}

public class weight1 {
    public static void main(String[] args) {
        Weight w1 = new Weight(5, 800);
        Weight w2 = new Weight(3, 500);
        Weight w3 = new Weight(0, 0);   // object to store result

        w3.add(w1, w2);   // adding w1 and w2, result in w3
        w3.display();
    }
}
