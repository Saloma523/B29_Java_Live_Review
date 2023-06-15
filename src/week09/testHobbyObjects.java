package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class testHobbyObjects {
    public static void main(String[] args) {



        Hobby golf = new Hobby("Golf",1000,true,false);
        Hobby puzzle = new Hobby("Puzzle",100,false,false);
        Hobby soccor = new Hobby("Soccor", 200,true,true);
        Hobby chess = new Hobby("Chess",50,false,true);
        Hobby tennis = new Hobby("Tennis",400,true,true);
        Hobby bowling = new Hobby("Bowling",300,true,true);
        Hobby dancing = new Hobby("Dancing",500,false,true);
        Hobby java = new Hobby("java");

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf,puzzle,soccor,chess,tennis,bowling,dancing,java));

        hobbies.addAll(Arrays.asList(
                new Hobby("Ping Pang", 200, false,false),
                new Hobby("Swimming",150,false,false)
        ));

        System.out.println(hobbies);

        for(Hobby each: hobbies){
            each.doIt();
        }

        ArrayList<Hobby> outdoors = new ArrayList<>(hobbies);
        outdoors.removeIf(p-> p.isOutdoors == true);
        System.out.println(hobbies);

        ArrayList<Hobby> requireOthers = new ArrayList<>(hobbies);
        requireOthers.removeIf(p-> p.requiresOthers);
        System.out.println(requireOthers);

        ArrayList<Hobby> highCost = new ArrayList<>(hobbies);
        hobbies.removeIf(p-> p.annualCost > 500);
        System.out.println(hobbies);

        ArrayList<Hobby> less200Indore = new ArrayList<>(hobbies);
        less200Indore.removeIf(p -> p.annualCost > 200 && p.isOutdoors);
        System.out.println(less200Indore);

        ArrayList<Hobby> outRquire = new ArrayList<>(hobbies);
        outdoors.removeIf(p -> p.requiresOthers && p.isOutdoors);
        System.out.println(less200Indore);





    }
}
/*
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

	-----------------------------
 */
