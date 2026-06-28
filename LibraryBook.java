public class LibraryBook {
    // Encapsulated fields
    private String title;
    private String author;
    private boolean isBorrowed;

    public LibraryBook(String title, String author) {
        this.title      = title;
        this.author     = author;
        this.isBorrowed = false; // default: available
    }

    // Getters
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void displayStatus() {
        String status = isBorrowed ? "Borrowed" : "Available";
        System.out.println("[" + status + "] " + title + " by " + author);
    }
}