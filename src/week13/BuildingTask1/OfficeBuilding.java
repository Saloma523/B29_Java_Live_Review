package week13.BuildingTask1;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("paying for office building");
    }

    @Override
    public void elevator(int floor) {

        System.out.println("sitting in the office building backyard");
    }

    @Override
    public String toString() {
        return super.toString() + " , number of floors " + numberOfFloors;
    }
}
/*
	- Create an class OfficeBuilding
		child class of Building
            implements HasElevator

            create instance variable
    int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors

 */