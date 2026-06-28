import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<T> {
    // Encapsulated list utilizing the type parameter T
    private ArrayList<T> elements;

    public GenericStack() {
        elements = new ArrayList<>();
    }

    // Push: Places an item onto the top of the stack
    public void push(T item) {
        elements.add(item);
    }

    // Pop: Removes and yields the top element
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
