import java.util.Scanner;

public class Methods {
    // ===== 1. Factorial =====
    // Prefer returning values over modifying globals
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ===== 2. Prime Check =====
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ===== 3. String Repeater =====
    static String repeatString(String str, int times) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    // ===== 4. Method Overloading — calculateArea =====
    // Descriptive method name instead of just "area"
    // Overloading enhances flexibility but requires clear parameter differences

    // Circle area
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    static double calculateArea(double length, double width) {
        return length * width;
    }


    // ===== MAIN =====
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Factorial ---
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        System.out.println("\n--- Factorial ---");
        System.out.println(num + "! = " + factorial(num));

        // --- Prime Check ---
        System.out.print("\nEnter a number to check if it's prime: ");
        int primeNum = scanner.nextInt();
        System.out.println("\n--- Prime Check ---");
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " IS a prime number.");
        } else {
            System.out.println(primeNum + " is NOT a prime number.");
        }

        // --- String Repeater ---
        scanner.nextLine(); // clear buffer
        System.out.print("\nEnter a string to repeat: ");
        String str = scanner.nextLine();
        System.out.print("How many times? ");
        int times = scanner.nextInt();
        System.out.println("\n--- String Repeater ---");
        System.out.println(repeatString(str, times));

        // --- Method Overloading: Area ---
        System.out.print("\nEnter radius for circle area: ");
        double radius = scanner.nextDouble();
        System.out.println("\n--- Area Calculator (Overloaded) ---");
        System.out.printf("Circle area (radius=%.2f): %.4f%n", radius, calculateArea(radius));

        System.out.print("Enter length for rectangle area: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width for rectangle area: ");
        double width = scanner.nextDouble();
        System.out.printf("Rectangle area (%.2f x %.2f): %.4f%n", length, width, calculateArea(length, width));

        scanner.close();
    }
}
