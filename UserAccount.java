import java.io.Serializable;

// Custom Object Task: The class MUST implement the Serializable marker interface
public class UserAccount implements Serializable {
    // A best-practice identifier for verifying class compatibility during deserialization
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;

    // Tips & Tricks Task: Use 'transient' to skip fields that shouldn't be saved to disk
    private transient String password;

    public UserAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password; // Will reside in memory, but won't persist to the binary file
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' + " (Notice: null after deserialization!)}";
    }
}
