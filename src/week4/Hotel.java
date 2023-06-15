package week4;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the hotel\nHow many days will you stay");
        int days = input.nextInt();

        System.out.println("How many people are in your party");
        int people = input.nextInt();

        double price;
        String roomType;
        String result = "";

        if(people == 1){ // i can use switch to for this
          roomType = "single room";
          price = days * 100;
          result = "Number of people: " + people + "\nAssinged to: " + roomType + "\nPrice is: " + price;
        }else if(people == 2){
            roomType = "double room";
            price = days * 125;
            result = "number of people: " +
            "\nassigned to a" + roomType +
            "price is: " + price;
        }else if(people == 3 || people == 4){
            roomType = "large room";
            price = days * people * 50;
            result ="number of people: " + people +
                    "\nassigned to a " + roomType + "\nPrice is: " + price;
        }else if(people == 5 || people == 6){
            roomType = "suite";
            price = days * 1000;
            result = "number of people: " + people + "\nassigned to a " + roomType + "\nprice is: " + price;
        }else{
            result = "sorry " + people + " is not a valid group size";
        }
        System.out.println(result);
        input.close();

    }
}
/*
Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:
		number of people: 1
		assigned to a single room
		price is: number of days staying * 100

		number of people: 2
		assigned to a double room
		price is: number of days staying * 125

		number of people: 3 or 4
		assigned to a large room


		number of people: 5 or 6
		assigned to a suite
		price is: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size

 */
