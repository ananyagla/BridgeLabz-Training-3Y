package oops;

// Abstract Base Class
abstract class BankAccountt {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccountt(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Balance       : $" + balance);
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

// Interface for Loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account Subclass
class SavingsAccount extends BankAccountt implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;  // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for Savings Account");
        } else {
            System.out.println("Loan not approved");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;
    }
}

// Current Account Subclass
class CurrentAccount extends BankAccountt implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return 0;  // No interest for Current Account
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for Current Account");
        } else {
            System.out.println("Loan not approved");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankAccountt[] accounts = new BankAccountt[2];

        accounts[0] = new SavingsAccount("SAV001", "Alice", 1500);
        accounts[1] = new CurrentAccount("CUR001", "Bob", 4000);

        for (BankAccountt acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("Interest: $" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(10000);
            }

            System.out.println("----------------------------");
        }
    }
}

