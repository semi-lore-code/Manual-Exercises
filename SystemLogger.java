// SystemLogger.java
public class SystemLogger implements Loggable {

    // We only have to explicitly write the abstract method
    @Override
    public void logMessage(String message) {
        System.out.println("[INFO]: " + message);
    }

    // logDebug() is inherited automatically, but we can still override it if we want!
}
