import java.io.*;

public class AppendMode {
    public static void main(String[] args) {

        String filename = "log.txt";

        // Check if file exists before reading
        boolean fileExisted = new File(filename).exists();
        System.out.println("--- Append Mode ---");
        System.out.println("File existed before: " + fileExisted);

        // First write — create or append (true = append mode)
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(filename, true))) { // 'true' enables append mode
            writer.println("Entry 1: Program started.");
            writer.println("Entry 2: User logged in.");
            System.out.println("First batch written.");
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
            return;
        }

        // Second write — appends WITHOUT overwriting existing content
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(filename, true))) {
            writer.println("Entry 3: New data appended successfully.");
            writer.println("Entry 4: File still has previous entries.");
            System.out.println("Second batch appended.");
        } catch (IOException e) {
            System.out.println("Error appending: " + e.getMessage());
            return;
        }

        // Read and display full file to confirm all entries preserved
        System.out.println("\n--- Full File Contents (all entries) ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(++lineNum + ": " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
