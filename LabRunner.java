import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabRunner {
    public static void main(String[] args) {

        System.out.println("=== 1. Generic Pair Demo ===");
        Pair<String, Integer> entry = new Pair<>("User_ID", 4012);
        System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());


        System.out.println("\n=== 2. Generic Method Demo ===");
        List<String> fruits = Arrays.asList("Apple", "Mango", "Orange");
        ListPrinter.printList(fruits);


        System.out.println("\n=== 3. Generic Stack Demo ===");
        GenericStack<Double> exchangeRates = new GenericStack<>();
        exchangeRates.push(450.50);
        exchangeRates.push(1620.25);
        System.out.println("Popped rate: " + exchangeRates.pop());


        System.out.println("\n=== 4. Type Safety and Raw Types Evaluation ===");

        // DANGEROUS: Using a Raw Type (No diamond syntax or specified type)
        ArrayList rawList = new ArrayList();
        rawList.add("Hello World");
        rawList.add(100); // No error at compile time because raw types accept anything

        // SAFE: Declaring a strict Generic equivalent
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("Hello World");
        // safeList.add(100); // COMPILE ERROR! Java stops you before the code runs.

        System.out.println("Raw configuration accepts mixed objects: " + rawList);
        System.out.println("Generic configuration guarantees runtime safety.");
    }
}
