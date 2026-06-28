// Loggable.java
public interface Loggable {
    // Standard abstract method that must be written by the class
    void logMessage(String message);

    // Default method: Provides a ready-to-use concrete implementation out of the box
    default void logDebug(String debugInfo) {
        System.out.println("[DEBUG DEFAULT LOG] Timestamp: " + System.currentTimeMillis() + " -> " + debugInfo);
    }
}
