class Distance {
    private int feet;
    private int inches;

    void setDistance(int f, int i) {
        feet = f;
        inches = i;
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    Distance addDistance(Distance d2) {
        Distance result = new Distance();
        result.feet = this.feet + d2.feet;
        result.inches = this.inches + d2.inches;

        if (result.inches >= 12) {
            result.feet += result.inches / 12;
            result.inches = result.inches % 12;
        }

        return result;
    }

    Distance greaterDistance(Distance d2) {
        int total1 = this.feet * 12 + this.inches;
        int total2 = d2.feet * 12 + d2.inches;

        if (total1 >= total2)
            return this;
        else
            return d2;
    }
}

class DistanceDemo {
    public static void main(String args[]) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.setDistance(5, 9);
        d2.setDistance(3, 11);

        System.out.print("Distance 1: ");
        d1.displayDistance();

        System.out.print("Distance 2: ");
        d2.displayDistance();

        Distance sum = d1.addDistance(d2);
        System.out.print("Sum of distances: ");
        sum.displayDistance();

        Distance greater = d1.greaterDistance(d2);
        System.out.print("Greater distance: ");
        greater.displayDistance();
    }
}
