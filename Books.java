// Book.java
// Book implements Printable, so it MUST provide a concrete print() method
public class Books implements Printable {
    private String title;
    private String author;

    public Books (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Fulfilling the Printable contract
    @Override
    public void print() {
        System.out.println("Printing Book: '" + title + "' written by " + author);
    }
}
