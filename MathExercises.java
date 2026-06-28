import java.util.Scanner;

public class MathExercises {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1) Calculator: write a program to perform addition, subtraction, multiplication, and division on two user-input numbers.
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        // 2) Random Number: Generate a random integer between 1 and 100 using Math.random().
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println("Generating Random Number");
        System.out.println("Random number between 1 and 100: " + randomNum);

        // Area Calculator: Calculate the area of a circle given its radius(use Math.PI)
        double radius;
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);

        // Overflow: Experiment with int overflow by adding large numbers. Use long to fix it.
        System.out.println("THIS IS AN OVERFLOW EXPERIMENT USING INT");
        int intMax = Integer.MAX_VALUE;
        int overflowResult = intMax + 1;
        System.out.println("Integer.MAX_VALUE: " + intMax);
        System.out.println("MAX_VALUE + 1 (overflow): "+ overflowResult);
        // Fix using long
        long longResult = (long) intMax + 1;
        System.out.println("Fixed using long: " + longResult);

        scanner.close();
    }
}
