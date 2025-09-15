class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
}

class Out {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Bob", 1002, 3000.0);

        acc1.displayDetails();
        System.out.println("------------------");
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
