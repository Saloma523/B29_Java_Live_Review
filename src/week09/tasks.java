package week09;

public class tasks {
    /*

Holidays [LocalDate, ArrayList, methods]

	Create a method that will return an ArrayList made of LocalDate that represent federal holidays from the current year. Use the following sample data:

        1/1/2023
        1/16/2023
        2/20/2023
        4/9/2023
        4/16/2023
        5/29/2023
        6/19/2023
        7/4/2023
        9/4/2023
        10//9/2023
        11/10/2023
        11/23/2023
        12/25/2023

	Note: if you are not comfortable making it a method then create it in the main method

	Bonus: Create separate ArrayLists of the dates based on the season they are a part of
		- format all the dates with your own pattern

	------------------------------------------------------------------------

Hobby [classes, constructors, ArrayList]

    create a class called Hobby
    	instance variables:
    		name, annual cost, is outdoors (boolean), requires others (boolean)

        constructors
			- create a constructor that creates a Hobby object with the name
			- create a constructor that creates a Hobby object with the name and annual cost
			- create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

        - methods:

            - doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 1000, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside

            - toString()
                print all the Hobby information

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

	------------------------------------------------------------------------

DrinksVending [object types, ArrayList, constructor, Scanner, loops, methods]

	Create a program that will allow you to select a Drink from the vending machine.

	Create a Drink class:
		create instance variables: name, price, quantity
		create a constructor to initialize all the variables
		create a toString to print the object in a clean format

	Create a DrinkVending class:
		create a instance variable: allDrinks (ArrayList of Drink objects)
		create a constructor that will create an empty ArrayList
		create an overloaded constructor that will accept a ArrayList of Drinks of objects to initialize the vending machine with some Drinks
		create a toString to display the drinks in a nice format

	Create a method stock() that will accept an ArrayList of Drinks to fill the allDrinks ArrayList up. If the Drink exists add to the quantity

	Create a method vend(): that will accept a String for the Drink name the person wants
		Search for the drink in the the vending machine
			-> if we have the drink return the price
			-> if the drink is out of stock print: Sorry $name is out of stock and return -1
			-> if the drink is not in the vending machine print: Sorry $name not offered and return -2

		For the valid scenario after the price is printed reduce the quantity of that drink by 1.

	To test the code and run the program create a VendingMachine object and initialize some Drink object. Use the data below or create your own.

	Then print the Vending Machine
	Ask the user what drink they want to call the vend() method
	For testing purpose print the vending machine ArrayList

	Then test the stock method()

     */
}
