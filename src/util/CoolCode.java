package util;

public class CoolCode {
    public static double converterFromDollar(String currency, double amount) {
        double result = 0;
        switch (currency.toLowerCase()) {
            case "euro":
                result = amount * 91;
                break;
            case "yen":
                result = amount * 121.03;
                break;
            case "lira":
                result = amount * 14.85;
            case "won":
                result = amount * 1_217.52;
                break;
            case "reupee":
                result = amount * 181.45;
        }
        return result;
    }

    public static String swapFirstAndLast(String str) {

        int lastIndex = str.length() - 1;

        char first = str.charAt(0);
        char last = str.charAt(lastIndex);
        return last + str.substring(1, lastIndex) + first;// substring takes away on

    }


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


    public static int countHi(String str){
        int count = 0;
        for(int i = 0; i < str.length() -1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i +1) == 'i'){
                count++;
            }
        }
        return count;
    }












































































































































































}
