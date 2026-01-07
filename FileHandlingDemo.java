
import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {
        try {
            // Create a file
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // Write data into the file
            FileOutputStream fos = new FileOutputStream(file);
            String data = "This is file handling in Java";

            fos.write(data.getBytes());

            // Close the file
            fos.close();

            System.out.println("Data written and file closed successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
