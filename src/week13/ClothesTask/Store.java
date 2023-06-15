package week13.ClothesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {

    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt();
        Jacket jacket = new Jacket();

        ArrayList<Clothes> clothes = new ArrayList<>(Arrays.asList(tshirt,jacket));

        System.out.println(clothes);

        for(Clothes each: clothes){
            each.wear();
        }

    }
}
/*
create a class Store
	create a main method and create TShirt and Jacket objects
            create an ArrayList of Clothes. Add the different objects
    iterate through the ArrayList and call the wear() method
 */