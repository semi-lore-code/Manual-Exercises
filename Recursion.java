import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== 1. Fibonacci =====
        System.out.print("Enter n for Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println("\n--- Fibonacci ---");
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

        // ===== 2. Sum of Digits =====
        System.out.print("\nEnter a number to sum its digits: ");
        int num = scanner.nextInt();
        System.out.println("\n--- Sum of Digits ---");
        System.out.println("Sum of digits of " + num + " = " + sumOfDigits(num));

        // ===== 3. Power Function =====
        System.out.print("\nEnter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();
        System.out.println("\n--- Power Function ---");
        System.out.println(base + "^" + exp + " = " + power(base, exp));

        // ===== 4. Reverse String =====
        System.out.print("\nEnter a string to reverse: ");
        scanner.nextLine(); // consume leftover newline
        String str = scanner.nextLine();
        System.out.println("\n--- Reverse String ---");
        System.out.println("Reversed: " + reverseString(str));

        scanner.close();
    }

    // ===== Fibonacci =====
    // Base case: fib(0)=0, fib(1)=1
    // Recursive case: fib(n) = fib(n-1) + fib(n-2)
    // Note: elegant but less efficient than iterative for large n
    static int fibonacci(int n) {
        if (n <= 0) return 0;       // base case
        if (n == 1) return 1;       // base case
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
    }

    // ===== Sum of Digits =====
    // Base case: single digit number
    // Recursive case: last digit + sumOfDigits(remaining digits)
    static int sumOfDigits(int n) {
        n = Math.abs(n);            // handle negative numbers
        if (n < 10) return n;       // base case
        return (n % 10) + sumOfDigits(n / 10); // recursive case
    }

    // ===== Power Function =====
    // Base case: anything^0 = 1
    // Recursive case: base * power(base, exp-1)
    static int power(int base, int exp) {
        if (exp == 0) return 1;                    // base case
        return base * power(base, exp - 1);        // recursive case
    }

    // ===== Reverse String =====
    // Base case: empty or single character string
    // Recursive case: last char + reverse(remaining string)
    static String reverseString(String str) {
        if (str.length() <= 1) return str;         // base case
        return str.charAt(str.length() - 1)
                + reverseString(str.substring(0, str.length() - 1)); // recursive case
    }
}
