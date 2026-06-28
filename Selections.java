import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== 1. Grade Calculator =====
        System.out.print("Enter your numeric score: ");
        double score = scanner.nextDouble();

        String grade;
        // Use else-if to avoid redundant checks in nested if statements
        if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 45) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n--- Grade Calculator ---");
        System.out.println("Score: " + score + " => Grade: " + grade);


        // ===== 2. Leap Year Check =====
        System.out.print("\nEnter a year: ");
        int year = scanner.nextInt();

        // Short-circuit evaluation with && and || optimizes the condition
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("\n--- Leap Year Check ---");
        if (isLeapYear) {
            System.out.println(year + " IS a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }


        // ===== 3. Day of Week =====
        System.out.print("\nEnter day number (1=Monday ... 7=Sunday): ");
        int day = scanner.nextInt();

        System.out.println("\n--- Day of Week ---");
        // switch supports String and enums in Java 7+
        switch (day) {
            case 1:
                System.out.println("Monday — Start of the work week. Stay focused!");
                break;
            case 2:
                System.out.println("Tuesday — Keep the momentum going!");
                break;
            case 3:
                System.out.println("Wednesday — Halfway there!");
                break;
            case 4:
                System.out.println("Thursday — Almost Friday!");
                break;
            case 5:
                System.out.println("Friday — End of work week. Great job!");
                break;
            case 6:
                System.out.println("Saturday — Weekend! Time to relax.");
                break;
            case 7:
                System.out.println("Sunday — Rest up for the week ahead.");
                break;
            default:
                System.out.println("Invalid day. Please enter 1 to 7.");
        }


        // ===== 4. Number Classifier =====
        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();

        System.out.println("\n--- Number Classifier ---");
        if (number > 0) {
            System.out.println(number + " is POSITIVE.");
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        scanner.close();
    }
}