class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Method to open account
    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully for " + accountHolderName);
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Saving Account class
class SavingAccount extends BankAccount {
    private double interestRate = 4.0; // example rate in %

    // Calculate interest
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest (Saving Account): " + interest);
    }
}

// Fixed Deposit Account class
class FixedDepositAccount extends BankAccount {
    private double interestRate = 6.5; // example rate in %
    private int years;

    // Method to set FD duration
    void setDuration(int years) {
        this.years = years;
    }

    // Calculate maturity amount using simple interest
    void maturityAmount() {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount (Fixed Deposit): " + maturity);
    }
}

public class Main {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA123", "Rahul Sharma", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD456", "Anita Patel", 50000);
        fd.setDuration(3); // 3 years
        fd.maturityAmount();
    }
}
