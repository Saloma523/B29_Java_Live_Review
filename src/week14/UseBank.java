package week14;

public class UseBank {

    public static void main(String[] args) {

        Bank bank = new Bank(1200,1122334);

        bank.withdraw(100);

        System.out.println(bank.getBalance());
    }
}
