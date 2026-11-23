class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) { super(message); }
}
class Bank {
    double balance;
    Bank(double balance) { this.balance = balance; }
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insufficient funds! Balance: $" + balance);
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Bank b = new Bank(500);
        try {
            b.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
