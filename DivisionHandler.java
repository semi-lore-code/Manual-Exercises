import java.util.Scanner;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try {
            // This will throw ArithmeticException if divisor is 0
            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Use specific exception types — not just Exception
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());

        } finally {
            // finally ensures cleanup regardless of exceptions
            System.out.println("This always runs.");
            scanner.close();
        }
    }
}