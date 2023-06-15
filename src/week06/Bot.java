package week06;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        boolean run = true;

        System.out.println("Hello. Im the cydeo chat bot");
        while (run){

            System.out.println(">");
            String userInput = input.nextLine().toLowerCase().trim();

            switch (userInput){
                case "Helo":
                    System.out.println();
                case "dsrgf":
                case "fds":
                case "What we can take about?":
                case "e3rq":
                case "efr":
                    run = false;
                default:
                    System.out.println("sorry! i can not compute");
            }
        }
        input.close();
    }
}
/*
Bot [while, Scanner, conditional]
	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot
	user says | >bot responds
	hello | > world
	what is your age | > I was programmed in March
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to
	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)

 */
