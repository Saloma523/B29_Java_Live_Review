package week13.BuildingTask1;

import java.util.ArrayList;
import java.util.Arrays;

public class RealEstate {

    public static void main(String[] args) {

        House house1 = new House("Fairfax", 7000000,3);
        System.out.println(house1.price);
        System.out.println(house1.Location);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();
        Building house2 = new House("Chicago", 5000000,4);
        System.out.println(house2.price);
        System.out.println(house2.Location);
        System.out.println(((House) (house2)).numberOfResidents);
        System.out.println(house2);
        house2.pay();
        ((HasBackyard) (house2)).mowLawn();



        House house3 = (House)house2; // dowunCsring - > building - > House
        Apartment apartment1 = new Apartment("Mclean",5300000,5);
        Apartment apartment2 = new Apartment("Woodbridge",2300000,3);
       OfficeBuilding office1 = new OfficeBuilding("Lorton",7500000,6);
       OfficeBuilding office2 = new OfficeBuilding("Mclean",500000,5);

        ArrayList<Building> buildings = new ArrayList<>(Arrays.asList(house1,house2,apartment1,apartment2,office1,office2));

        for(Building each: buildings){
            each.pay();

        }

        for(Building each: buildings){
            System.out.println(BuildingUtil1.rent(each));

        }

        System.out.println("----------------------------------------------------------");

        Building max = buildings.get(0);

        for(Building each: buildings){

            if(each.price > max.price){
                max = each;
            }

        }
        System.out.println(max);

        System.out.println("----------------------------------------------------");

        ArrayList<Building> toFilter = new ArrayList<>(buildings);
        toFilter.removeIf(p-> p.price > 1_000_000);

        System.out.println(toFilter);

        System.out.println("----------------------------------------------------------------");

        System.out.println(BuildingUtil1.search("Mclean"));
    }

}
/*
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