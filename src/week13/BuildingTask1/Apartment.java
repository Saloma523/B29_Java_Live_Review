package week13.BuildingTask1;

public class Apartment extends Building implements HasBalcony{

    int monthOFLease;

    public Apartment(String location, double price, int monthOFLease) {
        super(location, price);
        this.monthOFLease = monthOFLease;
    }


    @Override
    public void pay() {
        System.out.println("paying for the apartment");
    }

    @Override
    public void openBalcony() {

        System.out.println("going into apartment backyard");
    }

    @Override
    public String toString() {
        return super.toString() + " , month of lease " + monthOFLease;
    }
}
/*
- Create an class Apartment
		child class of Building
            implements HasBalcony

            create instance variable
    int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease
 */