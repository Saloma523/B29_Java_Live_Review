package week05;



public class IQpalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("salma"));

    }

   /* public static boolean palindrome(String str){

        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){

            reverse+= str.charAt(i);
        }

        if(reverse.equalsIgnoreCase(str)){
            return true;
        }else{
            return false;
        }



    }*/

    public static boolean palindrome(String str) {

        // begin -> 0 - 1 -2 - 3
        //ent -> 6 - 5 - 4


        for (int begin = 0, end = str.length() - 1; begin < str.length() / 2; begin++, end--) {


            if(str.charAt(begin) != str.charAt(end)){//the characters are diffrent
                return false;
            }

        }
        return true;
    }





}
/*
IQ] Palindrome [method, String, loop]

	create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
	A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, it can be thought as the reverse of a word being the same as the original word

		Ex:
			racecar
			true

			anna
			true

			abc
			false

			abcba
			true

 */
