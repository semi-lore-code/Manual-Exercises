// ==================== FILE 2: Counter.java ====================
public class Counter {
    // Static field — shared across ALL instances to count how many are created
    static int instanceCount = 0;

    String label;

    Counter(String label) {
        this.label = label;
        instanceCount++; // increment every time a new Counter is created
    }

    static void showCount() {
        System.out.println("Total Counter instances created: " + instanceCount);
    }
}
