// Product.java
// Implementing Comparable<Product> allows us to define how Products are sorted
public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // This method defines the sorting rule. We will sort products by price.
    @Override
    public int compareTo(Product otherProduct) {
        // Returns a negative number if this price is lower
        // Returns zero if prices are identical
        // Returns a positive number if this price is higher
        return Double.compare(this.price, otherProduct.price);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (₦" + price + ")";
    }
}
