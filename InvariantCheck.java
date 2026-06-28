public class InvariantCheck {
    private String accountHolder;
    private double balance;
    private final double MINIMUM_BALANCE = 1000.0; // Invariant constraint

    public InvariantCheck (String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        checkInvariant(); // Validate state on creation
    }

    // A private helper to verify our class invariant rule stays unbroken
    private void checkInvariant() {
        assert balance >= MINIMUM_BALANCE : "Invariant Violated! Balance (₦" + balance + ") dropped below the required minimum of ₦" + MINIMUM_BALANCE;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing ₦" + amount + " from " + accountHolder + "'s account...");
        balance -= amount;

        // Verify that the operation did not break our object state
        checkInvariant();
        System.out.println("Withdrawal successful! New balance: ₦" + balance);
    }
}
