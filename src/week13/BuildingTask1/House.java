package week13.BuildingTask1;

public class House extends Building implements HasBackyard{

    int numberOfResidents;


    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("paying for the house");
    }

    @Override
    public void mowLawn() {

        System.out.println("going into the backyard");
    }

    @Override
    public String toString() {
        return super.toString() + " , number of residents " + numberOfResidents;
    }
}
/*

	- Create an class House
		child class of Building
            implements HasBackyard
                create instance variable
    int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents

 */