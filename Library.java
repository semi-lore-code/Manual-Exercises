public class Library {
    private String name;
    private LibraryBook[] books;
    private int count;

    public Library(String name, int capacity) {
        this.name  = name;
        this.books = new LibraryBook[capacity];
        this.count = 0;
    }

    public void addBook(LibraryBook book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Added: " + book.getTitle());
        } else {
            System.out.println("Library is full!");
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                if (!books[i].isBorrowed()) {
                    // Reflection trick: we need a setter — add one below
                    System.out.println("You borrowed: " + title);
                    return;
                } else {
                    System.out.println(title + " is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void showAllBooks() {
        System.out.println("\n--- " + name + " Book List ---");
        for (int i = 0; i < count; i++) {
            books[i].displayStatus();
        }
    }
}
