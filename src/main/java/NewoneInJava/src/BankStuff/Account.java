package NewoneInJava.src.BankStuff;

public class Account {

    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println("Your balance now is: " + this.balance);
    }

    public void addFunds(double funds) {
        this.setBalance(this.getBalance() + funds);
        System.out.println("You have added " + funds + " to your account. Your balance now is: " + this.getBalance());
    }

    public void withdrawalFunds(double funds) {
        this.setBalance(this.getBalance() - funds);
        System.out.println("You have withdrawal " + funds + " from your account. Your balance now is: " + this.getBalance());
    }

    public void sendTo(double funds, Account account) {
        this.setBalance(this.getBalance() - funds);
        account.setBalance(account.balance + funds);
        System.out.println("You send " + funds + ". Your balance now is " + this.balance);
    }
}
