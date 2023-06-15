package week07;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States" };

        //- Find and print all the first and last characters

        String firstLastCH ="";

        for (String each : countries) {
            firstLastCH+= " " +each.charAt(0) + each.charAt(each.length()-1);

        }
        System.out.println(firstLastCH);

        System.out.println("--------------------------------------------------------");

       // - Find the smaller countries based on the length of their names

        String small = countries[0];
        String large = countries[0];

        for(String each: countries){
            if(each.length() < small.length()){
                small = each + " ";
            }else if(each.length() > large.length()){
                large = each;
            }
        }
        System.out.println(small);
        System.out.println(large);

        System.out.println("-----------------------------------------------------");
       // - Show all the countries that start with a 'C'
        String starWithC = "";
        for(int i = 0; i < countries.length ; i++){
            if(countries[i].toLowerCase().startsWith("c")){
                starWithC += countries[i]+ " ";
            }
        }
        System.out.println(starWithC);
        String[] hasC = starWithC.split(" ");
        System.out.println(Arrays.toString(hasC));



        System.out.println("------------------------------------------------------------");
        //- Show all the countries that end with an 's'

        String endWithE = "";
        for(String each: countries){
            if(each.endsWith("e")){
                endWithE += each;
            }
        }
        System.out.println(endWithE);
        String[] endsS = endWithE.split(" ");
        System.out.println(Arrays.toString(endsS));

        System.out.println("---------------------------------------------------------");
        //- Show the countries names in alphabetical order

       Arrays.sort(countries);






    }

}
/*
Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

    - Show the countries names in alphabetical order

 */