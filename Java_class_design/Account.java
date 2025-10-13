import java.util.ArrayList;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("   Account No: " + acc.getAccountNumber() + ", Balance: " + acc.getBalance());
        }
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(account);
        System.out.println("Account opened at " + bankName + " for " + customer);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

class AssociationExample {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Account a1 = new Account(1001, 5000);
        Account a2 = new Account(1002, 10000);
        Account a3 = new Account(2001, 7000);

        bank.openAccount(c1, a1);
        bank.openAccount(c1, a2);
        bank.openAccount(c2, a3);

        bank.showCustomers();
    }
}
