package Inheritance.example5;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500);

        savingsAccount.deposit(100);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(9000);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(450);
    }
}
