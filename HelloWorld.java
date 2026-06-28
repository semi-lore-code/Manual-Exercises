import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // 1) Hello World: Write and run the HelloWorld program. Modify it to print your name.
        System.out.println("Hello World!");
        String name = "Omowunmi";
        System.out.println("Hello " + name);

        // 2) Variables: Declare variables of type int, double, and boolean. Print their values.
        int age = 20;
        double CGPA = 4.65;
        boolean isStudent = true;

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I am a student with a " + CGPA + " CGPA");
        System.out.println(isStudent);

        // 3) Comments: add single-line(//) and multi-line(/* */) comments to a program.

        // This ia a single line comment
        /*
        This is a multi-line comment
         */

        // 4) Input: use scanner to read a user's name and print a greeting.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Hello, " + fullName + "! Welcome to Java programming.");

        scanner.close();
    }
}
