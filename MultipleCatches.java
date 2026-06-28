import java.util.Scanner;

public class MultipleCatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Multiple Catches Demo ---");
        System.out.print("Enter a number: ");

        try {
            String input = scanner.next();

            // Could throw NumberFormatException if not a valid number
            int number = Integer.parseInt(input);

            // Could throw ArithmeticException if number is 0
            int result = 100 / number;

            // Could throw ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println("Array element: " + arr[number]);

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            // Specific: input wasn't a valid integer
            System.out.println("Error: Please enter a valid integer!");
            System.out.println("Details: " + e.getMessage());

        } catch (ArithmeticException e) {
            // Specific: division by zero
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Details: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            // Specific: index out of bounds
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Details: " + e.getMessage());

        } catch (Exception e) {
            // General catch — last resort, avoid catching Throwable or Error
            System.out.println("Unexpected error: " + e.getMessage());

        } finally {
            System.out.println("Program finished — cleanup done.");
            scanner.close();
        }
    }
}
