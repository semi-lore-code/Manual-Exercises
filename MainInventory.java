public class MainInventory {
    public static void main(String[] args) {

        // ===== Car =====
        System.out.println("========= Car Class =========");
        Car car1 = new Car("Toyota Camry", 0);
        Car car2 = new Car("Honda Civic", 0);
        car1.accelerate(60);
        car1.accelerate(40);
        car1.brake(30);
        car2.accelerate(80);
        car1.displayInfo();
        car2.displayInfo();

        // ===== Library System =====
        System.out.println("\n========= Library System =========");
        Library lib = new Library("Elizade University Library", 5);
        lib.addBook(new LibraryBook("Things Fall Apart",         "Chinua Achebe"));
        lib.addBook(new LibraryBook("Half of a Yellow Sun",      "Chimamanda Adichie"));
        lib.addBook(new LibraryBook("Java: Complete Reference",  "Herbert Schildt"));
        lib.borrowBook("Things Fall Apart");
        lib.borrowBook("Unknown Book");
        lib.showAllBooks();

        // ===== Shape Hierarchy =====
        System.out.println("\n========= Shape Hierarchy =========");
        Circle         c = new Circle("Red", 7.0);
        RectangleShape r = new RectangleShape("Blue", 5.0, 3.0);
        c.display();
        System.out.println();
        r.display();

        // ===== Inventory System =====
        System.out.println("\n========= Inventory System =========");
        Inventory inv = new Inventory(10);
        inv.addItem(new Item("Resin Kit",      4500.00, 10));
        inv.addItem(new Item("Pigment Set",    2200.00,  5));
        inv.addItem(new Item("Silicone Mould", 1800.00,  8));
        inv.showInventory();
        System.out.printf("%nTotal Inventory Value: NGN%.2f%n", inv.totalValue());
    }
}
