package week2;

public class Balance {
    /*
    Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing
     */
    public static void main(String[] args) {

        double balance = 5000;
        double withdrawal = 1600.99;
         balance -= withdrawal;

        if(balance <0){
            System.out.println("Withdraw more than you in the account. overdraft applied");
            balance += (balance * 1.2);// if there is over draft we are applying 20 % fee

        }

        System.out.println("Total balance: " + balance);





    }
}
