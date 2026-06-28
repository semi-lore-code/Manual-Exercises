public class Inventory {
    private Item[] items;
    private int    count;

    public Inventory(int capacity) {
        this.items = new Item[capacity];
        this.count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count++] = item;
            System.out.println("Added to inventory: " + item.getName());
        } else {
            System.out.println("Inventory full!");
        }
    }

    public void showInventory() {
        System.out.println("\n--- Inventory ---");
        System.out.printf("%-20s %-15s %s%n", "Item", "Price", "Quantity");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < count; i++) {
            items[i].display();
        }
    }

    public double totalValue() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice() * items[i].getQuantity();
        }
        return total;
    }
}
