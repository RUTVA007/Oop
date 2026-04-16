class BankAccount {
    // Instance variables
    private String accountHolderName;
    private double balance;

    // Static variable (shared by all accounts)
    private static double interestRate = 0.05; // 5% default

    // Constructor
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * interestRate;
    }

    // Method to display interest
    public void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
    }

    // Static method to update interest rate
    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + (interestRate * 100) + "%");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        // Update interest rate using static method
        BankAccount.updateInterestRate(0.07);

        System.out.println("\nAfter updating interest rate:\n");

        acc1.displayInterest();
        acc2.displayInterest();
    }
}
