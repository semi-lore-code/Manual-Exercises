import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        String filename = "sample.txt";

        // First, create the file with some content to count
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Java is a powerful programming language.");
            writer.println("File I/O allows reading and writing to files.");
            writer.println("Word counting is a common text processing task.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        // Now count words — use try-with-resources to automatically close files
        int wordCount = 0;
        int lineCount = 0;

        // Check if file exists before reading
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                // Scanner can parse strings with custom delimiters
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()) {
                    lineScanner.next();
                    wordCount++;
                }
                lineScanner.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("--- Word Counter ---");
        System.out.println("File     : " + filename);
        System.out.println("Lines    : " + lineCount);
        System.out.println("Words    : " + wordCount);
    }
}
