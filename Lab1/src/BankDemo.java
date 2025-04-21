public class BankDemo {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("Sabina", 1000);
        BankAccount acc2 = new BankAccount("Sam");

        // Deposit without interest
        acc1.deposit(500);

        // Deposit with interest
        acc1.deposit(200, 5); // 5% interest on current balance

        // Withdraw without fee
        acc1.withdraw(300);

        // Withdraw with fee
        acc1.withdraw(200, 10);

        // Try to withdraw more than balance
        acc2.withdraw(100);

        // Deposit then withdraw for second account
        acc2.deposit(200);
        acc2.withdraw(50, 5);
    }
}

