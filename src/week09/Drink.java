package week09;

public class Drink {

    public String name;
    public double price;
    public int quantity;


    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
/*
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

