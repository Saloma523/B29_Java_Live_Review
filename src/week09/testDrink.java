package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class testDrink {
    public static void main(String[] args) {


        // this an ArrayList of Drink objects
        ArrayList<Drink> soda = new ArrayList<>(Arrays.asList(
                new Drink("Coke",1.99,12),
        new Drink("Coke",1.99,15),
        new Drink("Pepsi",1.99,8),
        new Drink("7up",1.99,9),
        new Drink("Fanta",1.99,20),
        new Drink("Coke",1.99,23)));


        // another ArrayList with Drink Objects
        ArrayList<Drink> juice = new ArrayList<>(Arrays.asList(
                new Drink("Orange juice",1.99,22),
                new Drink("Apple juice",1.99,10),
                new Drink("pomegranate juice",1.99,8),
                new Drink("pear juice",1.99,7),
                new Drink("mango juice",1.99,9),
                new Drink("V8",1.99,17)));


        DrinkVending vending1 = new DrinkVending();
        vending1.allDrinks.add(new Drink("Redbull",1.89,1));
        vending1.allDrinks.addAll(soda);
        System.out.println(vending1);
        System.out.println(vending1.allDrinks);// prints all vending

        System.out.println("-----------------------------------");

        DrinkVending vending2 = new DrinkVending(juice);// calss the 2nd constructor
        System.out.println(vending2);


        ArrayList<Drink> newDrinks = new ArrayList<>(Arrays.asList( new Drink("pear juice",1.99,7),
                new Drink("mango juice",1.99,9) ));
        vending2.stock(newDrinks);
        System.out.println(vending2);

        System.out.println(vending2.vend("lemonade"));
        System.out.println(vending2.vend("Apple juice"));
    }
}
