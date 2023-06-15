package week4;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        input.close();

        char f = name.charAt(0);


    }
}
/*
Name [Scanner, String methods]

	Create a program that will ask the user to enter their name. The name should be accepted as (first name + space + last name). The program will not be able to handle any other format

	Take the name and do two things:
		1) Print the name in correct formatting meaning the first letter of the first name and last name would be uppercase and the rest will be lowercase

		2) Print the initials of the person
 */