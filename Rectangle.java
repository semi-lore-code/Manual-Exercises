// ==================== FILE 1: Rectangle.java ====================
public class Rectangle {
    // Fields
    double width;
    double height;

    // Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    double area() {
        return width * height;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (width + height);
    }

    // Display details
    void display() {
        System.out.println("Rectangle [width=" + width + ", height=" + height + "]");
        System.out.println("  Area      : " + area());
        System.out.println("  Perimeter : " + perimeter());
    }
}






