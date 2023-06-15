package util;

import java.util.ArrayList;

public class ArrayListUtils {

    public static int countCharInList(ArrayList<String> list, char letter){
        int count =0;
        for(String eachWord :list){
            for(char  eachLetter: eachWord.toCharArray()){
                if(eachLetter == letter){
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<Integer> convertArrToList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: arr){

            list.add(each);

        }

        return list;
    }

    public static int[] convertListToArr(ArrayList<Integer> list){

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);


        }
        return arr;
    }
}


