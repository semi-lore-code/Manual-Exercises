import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Reverse String: write a program to reverse a user-input string
        // Use StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.println("\n---Reverse String---");
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);

        //2. Vowel Counter: count the number of vowels in a string
        System.out.println("\nTHIS IS A VOWEL COUNTER PROGRAM");
        int vowelCount = 0;
        // Strings are immutable; toUpperCase() returns a new string
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        //3. Palindrome Check: check if a string is a palindrome(e.g, "radar")
        System.out.println("\n---Palindrome Check---");
        String cleanInput = input.toLowerCase().replaceAll("\\s+", "");
        String cleanReversed = new StringBuilder(cleanInput).reverse().toString();
        if (cleanInput.equals(cleanReversed)) {
            System.out.println("\"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        //4. Character Analysis: print all characters in a string along with their ASCII values.
        System.out.println("\n----Character Analysis---");
        System.out.println("Char\tASCII Value");
        System.out.println("----\t-----------");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Escape characters: \t for tab, \n for newline
            System.out.println(c + "\t" + (int) c);
        }

        scanner.close();
    }
}