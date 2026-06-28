// Parent class
public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() { return color; }

    // Method to be overridden by subclasses
    public double area() {
        return 0;
    }

    public void display() {
        System.out.println("Shape color : " + color);
        System.out.println("Area        : " + area());
    }
}