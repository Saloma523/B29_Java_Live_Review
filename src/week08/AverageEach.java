package week08;

import java.util.Arrays;

public class AverageEach {
    public static void main(String[] args) {

        int[][] nums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};


        double sumOfAll =0;
        int  totalNumberOfElements = 0;


        for (int[] each1dArr : nums) {
            double sumEach = 0;// this should reset every time the outer loop runs

            for (int eachElements : each1dArr) {

                sumEach += eachElements;

            }
            double average = (sumEach / each1dArr.length);// average = sum of number/ amout of numbers
            System.out.println("Average of " + Arrays.toString(each1dArr) + average);

            sumOfAll+= sumEach;// adding the  sum of each inner array to the total sum
            totalNumberOfElements+= each1dArr.length;


        }
        System.out.println("Average of all = " + (sumOfAll/totalNumberOfElements));


    }
}
/*
verageEach [multidimensional, loop]

	Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

	Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
        	average of: [3, 4, 5, 6] is 4.5
        	average of: [5, 2, 6] is 4.3
        	average of: [10, 40, 25] is 25.0
        	average of all is 10.6


 */


