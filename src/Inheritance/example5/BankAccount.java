package Inheritance.example5;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful. New balance: $ " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}
