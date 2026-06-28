import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== 1. Sum of Numbers (for loop) =====
        System.out.print("Enter n to sum from 1 to n: ");
        int n = scanner.nextInt();

        int sum = 0;
        // Use for loop when the number of iterations is known
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("\n--- Sum of Numbers ---");
        System.out.println("Sum of 1 to " + n + " = " + sum);


        // ===== 2. Number Guesser (while loop) =====
        System.out.println("\n--- Number Guesser ---");
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        // Use while for condition-driven loops
        while (guess != secret) {
            System.out.print("Guess a number (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too LOW! Try again.");
            } else if (guess > secret) {
                System.out.println("Too HIGH! Try again.");
            } else {
                System.out.println("CORRECT! You got it in " + attempts + " attempt(s).");
            }
        }


        // ===== 3. Multiplication Table (nested for loops) =====
        System.out.print("\nEnter a number for multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\n--- Multiplication Table for " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        // ===== 4. 5x5 Grid of Asterisks (nested loops) =====
        System.out.println("\n--- 5x5 Grid of Asterisks ---");
        // Nested loops can create patterns
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }

        scanner.close();
    }
}
