import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationLabRunner {
    private static final String OBJECT_FILE = "users.ser";

    public static void main(String[] args) {

        // --- Tasks 1 & 3: Create, Populate, and Serialize a List of Objects ---
        System.out.println("=== 1 & 3. Custom Object & List Serialization ===");

        ArrayList<UserAccount> activeUsers = new ArrayList<>();
        activeUsers.add(new UserAccount("Kemi88", "kemi@domain.com", "SecurePass123"));
        activeUsers.add(new UserAccount("Tunde_Dev", "tunde@code.ng", "MySecretKey99"));

        System.out.println("Original objects before saving:");
        for (UserAccount u : activeUsers) System.out.println(u);

        // Try-with-resources automatically closes streams when done
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OBJECT_FILE))) {
            oos.writeObject(activeUsers); // Serializes the entire ArrayList structure safely
            System.out.println("\nSuccessfully serialized list to " + OBJECT_FILE);
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // --- Deserialization Phase with explicit Error Handling ---
        System.out.println("\n=== 4. Deserialization & Robust Error Handling ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(OBJECT_FILE))) {

            @SuppressWarnings("unchecked")
            List<UserAccount> restoredUsers = (List<UserAccount>) ois.readObject();

            System.out.println("Objects successfully recovered from file:");
            for (UserAccount u : restoredUsers) {
                System.out.println(u);
                // Notice how password fields come back as 'null' because they were transient!
            }

        } catch (InvalidClassException e) {
            // Task 4: Explicitly catching class mismatch modifications
            System.out.println("Critical Error: The class blueprint changed since this file was saved!");
            System.out.println("Details: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O Error loading data: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Target class blueprint could not be found: " + e.getMessage());
        }


        // --- Task 2: Binary Counter Sequences ---
        System.out.println("\n=== 2. Primitive Binary Counter Pipeline ===");
        BinaryCounter.saveCounterSequence(5);
        BinaryCounter.readCounterSequence(5);
    }
}
