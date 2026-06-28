import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCounter {
    private static final String BINARY_FILE = "counter.bin";

    public static void saveCounterSequence(int limit) {
        // DataOutputStream lets us write primitive Java data types directly as binary values
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(BINARY_FILE))) {
            System.out.println("Writing integer sequence to binary file...");
            for (int i = 1; i <= limit; i++) {
                out.writeInt(i); // Writes 4 bytes per integer directly
            }
        } catch (IOException e) {
            System.out.println("Error writing binary counter: " + e.getMessage());
        }
    }

    public static void readCounterSequence(int limit) {
        try (DataInputStream in = new DataInputStream(new FileInputStream(BINARY_FILE))) {
            System.out.println("Reading integers back from binary file:");
            for (int i = 1; i <= limit; i++) {
                int value = in.readInt();
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading binary counter: " + e.getMessage());
        }
    }
}
