// ==================== FILE 5: Main.java ====================
public class Main {
    public static void main(String[] args) {

        // --- Rectangle ---
        System.out.println("========= Rectangle Class =========");
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(10.0, 4.5);
        r1.display();
        r2.display();

        // --- Counter ---
        System.out.println("\n========= Counter Class =========");
        Counter c1 = new Counter("First");
        Counter c2 = new Counter("Second");
        Counter c3 = new Counter("Third");
        Counter.showCount(); // static method called on class, not object

        // --- Book ---
        System.out.println("\n========= Book Class =========");
        Book b1 = new Book("Things Fall Apart",   "Chinua Achebe");
        Book b2 = new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adichie");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

        // --- Student Manager ---
        System.out.println("========= Student Manager =========");
        StudentManager s1 = new StudentManager("Omowunmi", 20, 4.5);
        StudentManager s2 = new StudentManager("Mariam",    21, 3.8);
        StudentManager s3 = new StudentManager("Semilore",   19, 4.1);
        s1.introduce();
        s2.introduce();
        s3.introduce();
    }
}
