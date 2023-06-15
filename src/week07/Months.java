package week07;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("pleas Enter a month number");
        int month = input.nextInt();
        input.close();

        if(month >= 1 && month <= 12){
            String[] monthName = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
            System.out.println(monthName[month-1]);
        }else{
            System.out.println("invalid month number");
        }
    }
    /*
    Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word

     */
}
