package Abstract.example3;

abstract class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);


}
