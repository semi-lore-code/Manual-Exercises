import java.io.*;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {

        String filename = "students.txt";
        Scanner input   = new Scanner(System.in);

        // Write student records to file
        System.out.println("--- Enter Student Records ---");
        System.out.print("How many students? ");
        int count = input.nextInt();
        input.nextLine(); // consume newline

        // try-with-resources — automatically closes file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter name for student " + i + ": ");
                String name = input.nextLine();

                System.out.print("Enter grade for " + name + ": ");
                String grade = input.nextLine();

                // Write to file in CSV format
                writer.println(name + "," + grade);
            }
            System.out.println("Records saved to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        // Check file exists before reading
        if (!new File(filename).exists()) {
            System.out.println("File missing!");
            return;
        }

        // Read and display records
        System.out.println("\n--- Student Records ---");
        System.out.printf("%-20s %s%n", "Name", "Grade");
        System.out.println("----------------------------");

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Scanner can parse with custom delimiters — comma here
                Scanner lineScanner = new Scanner(line).useDelimiter(",");
                String name  = lineScanner.next();
                String grade = lineScanner.next();
                System.out.printf("%-20s %s%n", name, grade);
                lineScanner.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        input.close();
    }
}
