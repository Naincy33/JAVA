class Storage<T> {
    private T data;

    public Storage(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
public class AfterGenericsExample {
    public static void main(String[] args) {

        Storage<String> s1 = new Storage<>("Hello");
        Storage<Integer> s2 = new Storage<>(100);
        Storage<Double> s3 = new Storage<>(55.75);

        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s3.getData());
    }
}
