class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance (via getter): " + getBalance()); // private accessed via public method
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("---------------------");
    }
}

class BankSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("AC12345", "Alice", 5000);
        ba.displayAccountDetails();

        SavingsAccount sa = new SavingsAccount("AC67890", "Bob", 10000, 5);
        sa.displaySavingsDetails();
    }
}
