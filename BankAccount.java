// Abstract Superclass
public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Abstract method: Rules for taking out money vary wildly between account types
    public abstract void withdraw(double amount);

    // Concrete method: Depositing money works exactly the same way for everyone
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₦" + amount + " successfully.");
        }
    }

    // Helpful getters and setters for our subclasses to use safely
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Subclass 1: SavingsAccount (Cannot go negative)
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        // Strict check: Savings accounts cannot drop below zero balance
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Savings Account " + getAccountNumber() + " withdrew: ₦" + amount);
        } else {
            System.out.println("Transaction Rejected! Insufficient funds in Savings Account.");
        }
    }
}

// Subclass 2: CurrentAccount (Allows overdraft protection limits)
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 50000.0; // Allowed to spend up to ₦50,000 past zero

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        // Advanced check: Balance + Overdraft allowance must cover the withdrawal amount
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Current Account " + getAccountNumber() + " withdrew: ₦" + amount);
        } else {
            System.out.println("Transaction Rejected! Overdraft limit exceeded.");
        }
    }
}
