package week13.GymTask;

import week13.GymTask.Exercise;

public final class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return 0;
    }
}
/*
reate a class Running
	inherit the Exercise class and implement the abstract methods
		for calories method return minutes * 15

 */