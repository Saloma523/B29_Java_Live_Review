package week2;

public class BestBuy {

    public static void main(String[] args) {
         int tvs = 50;
        System.out.println("Someone came in to buy one tv");
        tvs -= 1;
        System.out.println("Number of tvs now is: " + tvs);

        System.out.println(" someone 2 came in to buy a tv");
        --tvs;
        System.out.println("Number of tvs now is: " + tvs);
        System.out.println("Someone 3 came in tne store and put a tv in their cart" + tvs--);
        System.out.println("They left, how many tvs left in the store: " + tvs );

        System.out.println("The store get a shipment");

        tvs +=10;
        System.out.println("The number of tvs now in the store: " + tvs);


    }
}
