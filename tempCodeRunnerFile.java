class Demo {

    // Generic Method
    public <T> void design(T n) {
        int num = Integer.parseInt(n.toString());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {

        Demo obj = new Demo();

        obj.design(4);   // passing integer
        obj.design(5.0); // passing double
        obj.design("3"); // passing String
    }
}
