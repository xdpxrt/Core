package BankStuff;

public class Terminal {
    public static void main(String[] args) {

        Account account_001 = new Account();
        account_001.setBalance(250);
        Account account_002 = new Account(520);
        Account account_003 = new Account(1000);
        Account account_004 = new CreditCardAccount(320);


        account_002.printBalance();
        account_002.addFunds(360);
        account_002.withdrawalFunds(400);
        account_004.withdrawalFunds(100);
        account_002.sendTo(120,account_004);
        account_004.sendTo(250,account_001);
    }
}
