class BankAccount {
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
         System.out.println("Bank Account Simulation:-");
        BankAccount account = new BankAccount();

        account.accountNumber = "12345";
        account.balance = 1000;

        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();

        account.withdraw(1500);
        account.checkBalance();
    }
}
