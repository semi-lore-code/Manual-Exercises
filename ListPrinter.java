import java.util.List;

public class ListPrinter {

    // The <T> before the return type designates this as a generic method
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
