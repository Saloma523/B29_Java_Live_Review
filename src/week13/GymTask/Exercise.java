package week13.GymTask;

public abstract class Exercise {

    public abstract void perform();
    public abstract int getCaloriesBurned(int minutes);

}
/*
 Exercise [abstract class]

    create an abstract class Exercise
	create abstract methods: perform() & getCaloriesBurned(int minutes)

    create a class Running
	inherit the Exercise class and implement the abstract methods
		for calories method return minutes * 15

    create an abstract class Lifting
	inherit the Exercise class
    create abstract method: rackWeight()

    create a class Bench
	inherit the Lifting class and implement the abstract methods
		for calories method return minutes * 5

    create a class Gym to test the objects and methods

 */