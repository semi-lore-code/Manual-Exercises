// GraphicElement.java
// This class implements BOTH Drawable and Movable behavior simultaneously
public class GraphicElement implements Drawable, Movable {
    private String elementName;

    public GraphicElement(String elementName) {
        this.elementName = elementName;
    }

    // Overriding method from Drawable interface
    @Override
    public void draw() {
        System.out.println("Rendering graphic element: " + elementName);
    }

    // Overriding method from Movable interface
    @Override
    public void move() {
        System.out.println("Moving " + elementName + " to new coordinates on screen.");
    }
}
