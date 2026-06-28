import java.util.Scanner;

public class PositiveNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1. Positive Number Assertion ===");
        System.out.print("Enter a number greater than 0: ");
        int number = scanner.nextInt();

        // Assert statement syntax -> assert condition : "Error message to display if false";
        // If the user enters 0 or a negative number, an AssertionError is thrown.
        assert number > 0 : "Invalid Input! The number entered (" + number + ") must be positive.";

        System.out.println("Success! You entered a valid positive number: " + number);
    }
}
