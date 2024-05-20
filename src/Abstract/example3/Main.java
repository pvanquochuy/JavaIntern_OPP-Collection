package Abstract.example3;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CurrentAccount currentAccount = new CurrentAccount(2000);

        System.out.println("Savings Account:");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Current balance: $" + savingsAccount.getBalance());

        System.out.println("\nCurrent Account:");
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        System.out.println("Current balance: $" + currentAccount.getBalance());
    }
}
