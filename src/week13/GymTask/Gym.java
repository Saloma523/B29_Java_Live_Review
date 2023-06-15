package week13.GymTask;

public class Gym {

    public static void main(String[] args) {

        // Exercise obj = new Exercise();//can not instantiate abstract class

        Running running = new Running();
        running.perform();
        System.out.println( running.getCaloriesBurned(90));

        //Lifting obj = new Lifting();

        Bench bench = new Bench();
        bench.perform();;
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(40));


    }
}
/*
create a class Gym to test the objects and methods
 */