package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondBiggerNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));

        int max = Collections.max(list);
        System.out.println(max);

        list.removeAll(Arrays.asList(max));

        int secondMax = Collections.max(list);
        System.out.println(secondMax);





       /* ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));

        int max = Integer.MIN_VALUE;
        int secondMax = list.get(0);

        for(int each: list){

            if(each > max){
                secondMax = max;
                max =each;
            }

            if(each > secondMax && each < max){
                secondMax = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("second max = " + secondMax);

        */
    }
}

