package week08;

import util.ArrayListUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class countChar {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        System.out.println(ArrayListUtils.countCharInList(list,'a'));
        System.out.println(ArrayListUtils.countCharInList(list,'v'));
        System.out.println(ArrayListUtils.countCharInList(list,'s'));
    }
}
/*

CountChar [ArrayList, String, loop]

	Create a program that defines an ArrayList of Strings and a char letter. Find how many times the given char letter is found in the words defined in the ArrayList

		Ex:
		Input:
			"java", "html", "css", "java", "javascript", "selenium"
			letter: ‘a’
		Output:
			6
 */

