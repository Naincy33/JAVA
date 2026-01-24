
import java.io.*;

public class BufferedOutputDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String data = "BufferedOutputStream Example";
            byte[] b = data.getBytes();

            bout.write(b);
            bout.flush();   // forces data to be written
            bout.close();   // closes stream

            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
