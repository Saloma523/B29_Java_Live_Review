package week08;

import java.util.Arrays;

public class commonElement {
    public static void main(String[] args) {

        int[][] arr = {{4, 1, 24, 5}, {24, 1, 5, 2}, {4, 1, 5, 1}};

        String common = "";

        for(int i = 0; i < arr[0].length ;i++){// to go through the first inner array
            System.out.println(arr[0][i]);

            int isCommon = 1;

            for(int j = 0 ; j < arr.length; j++) {// to go through the other inner arrays

                System.out.println(Arrays.toString(arr[j]));

                for(int each: arr[j]){
                    if(each == arr[0][i])
                        isCommon++;
                    break;

                }
            }
            if(isCommon == arr.length){
                System.out.println(arr[0][i]);
            }
        }
        System.out.println(common);
    }
}
/*
ommonElements [multidimensional, loop]

	Create a program that will define a 2D int array with some numbers. Go through and find which elements can be found in all of the inner arrays

	Ex:
	       int[][] arr {
	              {4, 1, 24, 5},
	              {24, 1, 5, 2},
	              {4, 1, 5, 1}
	       }

	       common elements are: 1, 5

	       -> 4 is missing from the 2nd array & 24 is missing from the 3rd array so those aren't common elements

 */


