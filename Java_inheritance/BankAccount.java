class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
        displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
        displayInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration; // in months

    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        displayInfo();
        System.out.println("Duration: " + duration + " months");
    }
}

class bA {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 20000, 12);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();
    }
}
