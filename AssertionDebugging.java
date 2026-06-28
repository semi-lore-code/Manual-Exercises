public class AssertionDebugging {

    public static void main(String[] args) {

        int age = -5; // Bug: Age should not be negative
        assert age >= 0 : "Error: Age cannot be negative";

        int marks = 120; // Bug: Marks should be between 0 and 100
        assert marks >= 0 && marks <= 100 : "Error: Marks must be between 0 and 100";

        int divisor = 0; // Bug: Cannot divide by zero
        assert divisor != 0 : "Error: Divisor cannot be zero";

        int result = 10 / divisor; // Will not execute if assertion fails

        System.out.println("Result = " + result);
    }
}
