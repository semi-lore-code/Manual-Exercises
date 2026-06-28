// Custom exception class for invalid age input
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // pass message to parent Exception class
    }
}
