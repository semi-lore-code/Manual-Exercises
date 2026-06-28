public class Rectangle12 extends Shapes {
    private double length;
    private double width;

    public Rectangle12 (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}