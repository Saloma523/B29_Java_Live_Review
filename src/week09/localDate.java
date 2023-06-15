package week09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class localDate {


    public static ArrayList<LocalDate> getHolidays(){

        ArrayList<LocalDate> holidays = new ArrayList<>(Arrays.asList(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 16),
                LocalDate.of(2023, 2, 20),
                LocalDate.of(2023, 4, 9),
                LocalDate.of(2023, 4, 16),
                LocalDate.of(2023, 5, 29),
                LocalDate.of(2023, 6, 19),
                LocalDate.of(2023, 7, 4),
                LocalDate.of(2023, 9, 4),
                LocalDate.of(2023, 10, 9),
                LocalDate.of(2023, 11, 10),
                LocalDate.of(2023, 11, 23),
                LocalDate.of(2023, 12, 25)
        ));

        return holidays;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what month do you want to check");
        int inptMonth = input.nextInt();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM - d, yyy");

        for (LocalDate eachDate : getHolidays()) {
            if(eachDate.getMonthValue() == inptMonth){
                System.out.println(eachDate.format(format));
            }

        }




    }
}
