// Document.java
// Document also implements Printable, but handles the print action differently
public class Document implements Printable {
    private String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    // Fulfilling the Printable contract
    @Override
    public void print() {
        System.out.println("Printing Digital Document: " + fileName + ".pdf");
    }
}
