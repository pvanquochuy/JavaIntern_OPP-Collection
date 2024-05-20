package Inheritance.example5;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= 100){
            super.withdraw(amount);
        }else{
            System.out.println("Withdrawal unsuccessful. Minimum balance requirement not met.");
        }
    }
}
