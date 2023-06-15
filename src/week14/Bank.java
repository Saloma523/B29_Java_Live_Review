package week14;

public class Bank {

    private double balance;
    private long accountNumber;

    public Bank(double balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new NotEnoughMoneyException("You only have " + balance + ", so you can not withdraw "+ amount);
        }

        System.out.println("withdrawing "+ amount);
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }



}
