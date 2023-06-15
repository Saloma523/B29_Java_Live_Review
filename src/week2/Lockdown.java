package week2;

public class Lockdown {

    public static void main(String[] args) {

        int year = 2020;


        if(year == 2020 || year == 2021){
            System.out.println("Practice java\nStay at home\nWear mask");
        }else{
            System.out.println("Party\nPractice Java\nTravel");
        }

        System.out.println("----------------------------------");

        int year1 = 2023;
        String result = "";


        if(year1 == 2020 || year1 == 2021){// we can also use (yer >= 2020 && yer <=2021)
            result = "Practice java\nStay at home\nWear mask";
        }else{
           result = "Party\nPractice Java\nTravel";

        }
        System.out.println(result);




    }
    /*
    Lockdown [if else]

	Declare and assign a year variable

	Using the year determine if we were on lockdown and we did on a daily basis

		if the year was 2020 or 2021 print:
			Stay at home
			Practice java
			Wear a mask

		if the year was any other year print:
			Party
			Practice Java
			Travel
     */
}
