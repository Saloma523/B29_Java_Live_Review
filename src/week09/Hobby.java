package week09;

public class Hobby {

    public String name;
    public double annualCost;
    public boolean isOutdoors;
    public boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
      this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing " + name +" " + ((isOutdoors)? " outdoors" : "inside"));

    }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
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



 */
