package week11.Access2;

import week11.Access.Windows;

public class runnerB {
    public static void main(String[] args) {

        Windows obj = new Windows();
        System.out.println(obj.os);
        //System.out.println(obj.memory);
        //System.out.println(obj.brand);
        // System.out.println(obj.hasWifi); // this  variable is private ,so it is not accessible outside the package
    }
}
