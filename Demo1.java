
class Demo1 {

    // Generic Method
    public <T> void design(T n) {
        int num = (int) Double.parseDouble(n.toString());


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Demo1 obj = new Demo1();

        obj.design(4);
        System.out.println("----");
        obj.design(5.0);
        System.out.println("----");
        obj.design("3");
// passing String
    }
}
