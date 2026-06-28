import java.io.*;

public class FileCopier {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destFile   = "destination.txt";

        // Create source file first
        try (PrintWriter writer = new PrintWriter(new FileWriter(sourceFile))) {
            writer.println("Line 1: Hello from source file.");
            writer.println("Line 2: Java File I/O is powerful.");
            writer.println("Line 3: Copying files is easy with BufferedReader.");
        } catch (IOException e) {
            System.out.println("Error creating source: " + e.getMessage());
            return;
        }

        // Check source exists before reading
        if (!new File(sourceFile).exists()) {
            System.out.println("Source file not found!");
            return;
        }

        // Copy source → destination using try-with-resources (auto-closes both)
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                PrintWriter    writer = new PrintWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            System.out.println("--- File Copier ---");
            System.out.println("Copied: " + sourceFile + " → " + destFile);

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }

        // Read and display destination file to verify
        System.out.println("\n--- Destination File Contents ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(destFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading destination: " + e.getMessage());
        }
    }
}
