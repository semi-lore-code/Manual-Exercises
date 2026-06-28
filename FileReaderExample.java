import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        // Attempt to read a nonexistent file
        String filename = "nonexistent_file.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new java.io.FileReader(filename));
            String line;
            System.out.println("--- File Contents ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // Specific catch — FileNotFoundException instead of generic Exception
            System.out.println("Error: File not found — " + filename);
            System.out.println("Details: " + e.getMessage());

        } catch (IOException e) {
            // Specific catch for other IO errors
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // finally ensures file is closed regardless of exceptions
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File reader closed.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
