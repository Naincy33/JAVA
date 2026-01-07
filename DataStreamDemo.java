import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        try {
            // Writing data using DataOutputStream
            DataOutputStream dout =
                new DataOutputStream(new FileOutputStream("data.dat"));

            dout.writeInt(10);
            dout.writeDouble(25.5);
            dout.writeBoolean(true);
            dout.close();

            // Reading data using DataInputStream
            DataInputStream din =
                new DataInputStream(new FileInputStream("data.dat"));

            int a = din.readInt();
            double b = din.readDouble();
            boolean c = din.readBoolean();

            din.close();

            // Display output
            System.out.println("Integer value: " + a);
            System.out.println("Double value: " + b);
            System.out.println("Boolean value: " + c);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
