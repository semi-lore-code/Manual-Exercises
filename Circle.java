// Subclass of Shape
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // call parent constructor
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle  | Color: " + getColor() + " | Radius: " + radius);
        System.out.printf ("Area    : %.2f%n", area());
    }
}
