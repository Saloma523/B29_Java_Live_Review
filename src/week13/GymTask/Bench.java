package week13.GymTask;

public class Bench extends Lifting {
    @Override
    public void perform() {
        System.out.println("Bench pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }

    @Override
    public void rackWeight() {
        System.out.println("racking on top");
    }
}
/*
 create a class Bench
	inherit the Lifting class and implement the abstract methods
		for calories method return minutes * 5

 */