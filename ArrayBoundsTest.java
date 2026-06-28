public class ArrayBoundsTest {

    // A helper method to fetch an element from an array safely
    public static int getElementAt(int[] array, int index) {
        // Asserting that the index falls cleanly within the valid bounds of the array
        assert index >= 0 && index < array.length : "Index Out of Bounds! Index " + index + " is invalid for array length " + array.length;

        return array[index];
    }

    public static void main(String[] args) {
        System.out.println("\n=== 2. Array Bounds Assertion ===");
        int[] scores = {85, 92, 78, 64, 99};

        // This will pass smoothly
        System.out.println("Element at index 2: " + getElementAt(scores, 2));

        // This will trigger the assertion error because index 10 does not exist
        System.out.println("Attempting to get index 10...");
        System.out.println("Element at index 10: " + getElementAt(scores, 10));
    }
}
