// ==================== FILE 3: Book.java ====================
public class Book {
    // Fields
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title  = title;
        this.author = author;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("--------------------");
    }
}
