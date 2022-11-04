package BankStuff;

public class CreditCardAccount extends Account {
    public CreditCardAccount() {
    }

    public CreditCardAccount(double balance) {
        super(balance);
    }

    public void withdrawalFunds(double funds) {
        this.setBalance(this.getBalance() - funds * 1.01);
        System.out.println("You have withdrawal " + funds + " from your account. Commission is " + funds * 0.01 + ". Your balance now is: " + this.getBalance());
    }

    public void sendTo(double funds, Account account) {
        this.setBalance(this.getBalance() - funds * 1.01);
        account.setBalance(account.getBalance() + funds);
        System.out.println("You send " + funds + ". Commission is " + funds * 0.01 + ". Your balance now is " + this.getBalance());
    }
}