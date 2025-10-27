import java.util.Scanner;

class Book {
    int bookId;
    String title;
    double price;

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Price: " + price);
    }
}

public class BookArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 Book objects
        Book[] books = new Book[5];

        // Accept details of 5 books
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            books[i] = new Book(id, title, price);
            
        }

        // Find the book with highest price
        double maxPrice = books[0].price;
        String maxTitle = books[0].title;

        for (int i = 1; i < 5; i++) {
            if (books[i].price > maxPrice) {
                maxPrice = books[i].price;
                maxTitle = books[i].title;
            }
        }

        System.out.println("\nBook with the highest price:");
        System.out.println("Title: " + maxTitle + " (Price: " + maxPrice + ")");

        sc.close();
    }
}
