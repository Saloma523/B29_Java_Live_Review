package week13.BuildingTask1;

public class BuildingUtil1 {

    public static double rent(Building building){

        if(building instanceof HasElevator){
            return building.price / 360 * 2;
        }else if(building instanceof OfficeBuilding){
            return building.price / 1000;
        }

        return -1; // if building is not a hose or offivebilding return -1
    }

    public static Building search(String location){
        if(location.equals("Great Falls")){
            return new House("Greate False",500_000,4);
        }else if(location.equals("Fairfax")){
            return new Apartment("Fairfax",750_000,6);
        }else if(location.equals("Mclean")){
            return new OfficeBuilding("Mclean",30000000,6);
        }

        return null;
    }


}
/*
 Building Part 2 [polymorphism, method, ArrayList]

            - create a class BuildingUtil

		create a static method Rent(Building obj)
			return: double
    parameters: Building type

    implementation:
            if the Building is House type
					return price / 360 * 2

            if the Building is Apartment type
					return price / 600

            if the Building is OfficeBuilding type
					return price / 1000

    create a static method search(String location)
			return: Building
    parameters: String location

    implementation
				if the location is Great Falls return a House object with:
    location: Great Falls
    price: 500_000
    number of residents: 4

            if the location is FairFax return a Apartment object with:
    location: FairFax
    price: 750_000
    month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
    location: McLean
    price: 3_000_000
    number of floors: 6

            - create a class RealEstate
		create a main method

                create an ArrayList of Building
			-> this can hold objects of House, Apartment, & OfficeBuilding

    create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

    mini tasks:

            - Search for a Building in a specific location
			- Iterate through and show the rent of all the buildings
			- Find the most expensive Building, print all its information
			- Find the least expensive Building, print all its information
			- Filter all the Buildings in one location(ex search for buildings in Chicago)
			- Filter all the Buildings within a certain price range

     */




