package week10.bestBuy;

import week10.bestBuy.BestBuy;

public class TestBestBuy {
    public static void main(String[] args) {

        //main/static/instance/constructor

        System.out.println("main method running");// runs first
        // static block runs before the  bestBuy class is used
        System.out.println(BestBuy.ceo);// runs last
        System.out.println(new BestBuy("1233444 cook Drive",2013,40));// instance block runs after we make an object

        System.out.println(BestBuy.revenue);
    }
}
