package week08;

import java.util.ArrayList;
import java.util.Arrays;

public class sumDigits {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "52", "513"));
        ArrayList<Integer> sums = new ArrayList<>();

        for(String each: list){
            //System.out.println(each);
            String[] eachArr = each.split("");
            // System.out.println(eachArr);

            int sum = 0;
            for(String eachDigit : eachArr){
                //System.out.println(eachDigit);
                System.out.println(Integer.parseInt(eachDigit));
                sum+= Integer.parseInt(eachDigit);

            }

            sums.add(sum);
        }
        System.out.println(list);
        System.out.println(sums);
    }
}
/*
SumDigits [Wrapper class, ArrayList, loop]

	Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

		Ex:
			Input:
			["123, "52", "513"]
			Output:
			[6, 7, 9]

 */


