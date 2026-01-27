class Counter {
    static int count = 1;
    int j;

    Counter() {
        count++;
        j = 10;
        System.out.println("Object created. Count = " + count);
    }

    public void display() {
        System.out.println("Count = " + count);
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        c1.display();

        System.out.println("Final count = " + Counter.count);
    }
}
