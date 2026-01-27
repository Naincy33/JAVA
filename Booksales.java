class Booksales {

    int id;
    String courseTitle;
    String author;
    String publisher;
    int edition;
    double price;

    // Default constructor
    Booksales() {
        id = 0;
        courseTitle = "NA";
        author = "NA";
        publisher = "NA";
        edition = 0;
        price = 0.0;
    }

    // Parameterized constructor
    Booksales(int id, String courseTitle, String author,
              String publisher, int edition, double price) {

        this.id = id;
        this.courseTitle = courseTitle;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Edition: " + edition);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Array of objects
        Booksales[] b = new Booksales[3];

        // Creating objects using parameterized constructor
        b[0] = new Booksales(101, "Java", "Herbert Schildt",
                "McGraw Hill", 5, 650);

        b[1] = new Booksales(102, "Python", "Guido",
                "Pearson", 3, 550);

        b[2] = new Booksales(103, "C++", "Bjarne Stroustrup",
                "OReilly", 4, 700);

        int searchId = 102;
        boolean found = false;

        // Search book based on ID
        for (int i = 0; i < b.length; i++) {
            if (b[i].id == searchId) {
                System.out.println("Book Found:");
                b[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found for ID: " + searchId);
        }
    }
}
