package week07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseMiddle {
    public static void main(String[] args) {
        String words = "more java please";
        String[] eachWord = words.split(" ");

        String reversWord = "";

        for (int i = eachWord[1].length()-1; i >=0; i--) {
            reversWord += eachWord[1].charAt(i);

        }
        System.out.println(eachWord[0] + reversWord + eachWord[2]);
        //System.out.println(Arrays.toString(eachWord).replace(eachWord[1],reversWord));
    }
}
/*
ReverseMiddle [array, String, loop]

	Create a program that will have a String consisting of three words. Print the String, but the middle word should be reversed

	Ex:
		input: more java please
		ouput: more avaj please

 */
