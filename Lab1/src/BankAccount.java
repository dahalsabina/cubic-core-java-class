class BankAccount {
    private static int nextAccountNumber = 1000; // Static field for unique account numbers
    private int accountNumber;
    private String name;
    private double balance;

    // Constructor with name and initial balance
    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber++;
        displayInfo();
    }

    // Constructor with name only, balance defaults to 0
    public BankAccount(String name) {
        this(name, 0.0);
    }

    // Method to withdraw without fee
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
        displayInfo();
    }

    // Overloaded method: withdraw with fee
    public void withdraw(double amount, double fee) {
        double total = amount + fee;
        if (total <= balance) {
            balance -= total;
            System.out.println("Withdrawn: $" + amount + " with fee $" + fee);
        } else {
            System.out.println("Insufficient balance for withdrawal + fee.");
        }
        displayInfo();
    }

    // Deposit without interest
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayInfo();
    }

    // Overloaded deposit with interest
    public void deposit(double amount, double interestPercent) {
        double interest = balance * interestPercent / 100;
        balance += amount + interest;
        System.out.println("Deposited: $" + amount + " with interest $" + interest);
        displayInfo();
    }

    // Display account info
    private void displayInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + String.format("%.2f", balance));
        System.out.println("----------------------------------------------------");
    }
}
