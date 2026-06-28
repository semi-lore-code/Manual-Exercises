// Subclass of Shape (named RectangleShape to avoid conflict with previous Rectangle.java)
public class RectangleShape extends Shape {
    private double width;
    private double height;

    public RectangleShape(String color, double width, double height) {
        super(color); // call parent constructor
        this.width  = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle | Color: " + getColor() +
                " | Width: " + width + " | Height: " + height);
        System.out.printf ("Area      : %.2f%n", area());
    }
}
