package week4;

import java.util.Scanner;

public class PennyMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of pennies");
        int cents = input.nextInt();// 246

        int dollars = cents/100;//246/ 100 = 2 d
        cents %= 100; // 246%100 = 46
        int quarters = cents/25;// 46/25 = 1 dim
        cents %= 25;// 45%25 = 21
        int dimes = cents/10;// 21\10 = 2
        cents %= 10; // 21%10 = 1
        int nickles = cents/5;// 1/5 =0
        cents %= 5;// 1%5 = 1

        String msg = cents + "converted to";



        if(cents >= 1 && cents <= 1200 ){

            msg += cents + dollars + " dollars" + quarters + "quarters" + dimes + "dims" + nickles + " nickles" + cents + " cents";


        }else{
            System.out.println("sorry we can not process your request");
        }


    }
}
/*
PennyMachine [scanner, if, operators]

	Create a program that will ask the user to enter the number of pennies they have. Use the number of cents they give and convert them to dollars, quarters, dimes, nickles, and left over pennies. This machine can only handle from 1-1200 cents at a type

	-> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

	-> if the cents are valid print the result in the following format:
		$initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

	Extra challenge: If there is 0 of a specific type do not include it in the final output

 */
