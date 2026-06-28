import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceLabRunner {
    public static void main(String[] args) {

        System.out.println("=== 1. Printable Interface Contract ===");
        Printable myBook = new Books ("Things Fall Apart", "Chinua Achebe");
        Printable myDoc = new Document ("Lecture_Notes");
        myBook.print();
        myDoc.print();


        System.out.println("\n=== 2. Multiple Interfaces Execution ===");
        GraphicElement avatar = new GraphicElement("PlayerAvatar");
        avatar.draw();
        avatar.move();


        System.out.println("\n=== 3. Default Interface Method ===");
        SystemLogger logger = new SystemLogger();
        logger.logMessage("Application initialized successfully.");
        // Invoking the default method inherited directly from the interface
        logger.logDebug("Connection string verified.");


        System.out.println("\n=== 4. Comparable Object Sorting ===");
        List<Product> storeInventory = new ArrayList<>();
        storeInventory.add(new Product("Wireless Mouse", 15000.0));
        storeInventory.add(new Product("Mechanical Keyboard", 45000.0));
        storeInventory.add(new Product("USB-C Adapter", 7500.0));

        System.out.println("Before Sorting: " + storeInventory);

        // This automatically calls the compareTo method inside the Product class
        Collections.sort(storeInventory);

        System.out.println("After Sorting (Lowest Price First): " + storeInventory);
    }
}
