package week4;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next().toLowerCase();// channing adding two cases
        input.close();

        int length = word.length();
        int middleIndex = length /2;
        String firstPart, middlePart, lastPart;


        if(length % 2 == 0){//even length EX: java-> 4/2 = 2
            firstPart = word.substring(0,middleIndex - 1);
            middlePart= word.substring(middleIndex - 1, middleIndex + 1);
            middlePart = middlePart.toUpperCase();
            lastPart = word.substring(middleIndex + 1);


        }else{//odd length
            firstPart = word.substring(0,middleIndex);
            middlePart = "" + word.charAt(middleIndex);
            // word.substring(middleIndex, middleIndex +)
            middlePart = middlePart.toUpperCase();
            lastPart = word.substring(middleIndex + 1);

        }
        System.out.println(firstPart + middlePart + lastPart);
        // abcde --> c - index 2| 5/2 = 2
        // abc -> b - index 1| 3/2 = 1
        // java | 4/2 =2

    }
}
/*
MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa
 */