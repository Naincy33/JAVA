import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        try {
            // Writing data to file
            FileOutputStream fout = new FileOutputStream("sample.txt");
            String data = "Java File Handling using I/O Streams";
            byte[] b = data.getBytes();
            fout.write(b);
            fout.close();

            System.out.println("Data written to file successfully");

            // Reading data from file
            FileInputStream fin = new FileInputStream("sample.txt");
            int ch;

            System.out.println("Reading data from file:");
            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("File Error: " + e);
        }
    }
}
