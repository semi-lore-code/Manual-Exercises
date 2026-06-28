import java.util.Scanner;

public class CustomException {
    // Method that throws our custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            // Throw custom exception with a descriptive message
            throw new InvalidAgeException(
                    "Invalid age: " + age + ". Age must be between 0 and 150."
            );
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Catch our specific custom exception
            System.out.println("Caught custom exception: " + e.getMessage());

        } finally {
            // Cleanup — close scanner regardless of what happened
            System.out.println("Age validation complete.");
            scanner.close();
        }
    }
}
