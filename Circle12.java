public class Circle12 extends Shapes {
    private double radius;

    public Circle12 (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
