public class ShapeArea {
    public static void main(String[] args) {
        Shapes circle = new Circle12(5);
        Shapes rectangle = new Rectangle12(4, 6);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
