package week06;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shoppingList = "";
        String amswer = "yes";
        int attemps = 3;

        do{
            System.out.println("Enter items");
           // String item = input.nextLine();
           // shoppingList+=item;
            shoppingList+= "\n\t*" + input.nextLine();

            System.out.println("do you want to add more items?");
            amswer = input.nextLine();
            while (attemps > 0 && !amswer.equalsIgnoreCase("yes") || amswer.equalsIgnoreCase("no")){
                System.out.println("sorry did you want to add more items");
                amswer = input.nextLine();
            }

        }while (amswer.equalsIgnoreCase("yes"));
        System.out.println(shoppingList);

        input.close();





        /*while (amswer.equalsIgnoreCase("yes")){
            System.out.println("enter item");
            String item = input.nextLine();

            System.out.println("do you want to add more items?");
            amswer = input.nextLine();
            System.out.println("enter item");
              item = input.nextLine();



            for (int i = 0; i < item.length(); i++) {
                shoppingList+=item;

            }



          if(amswer.equalsIgnoreCase("no")){

              System.out.println(shoppingList);

               System.exit(0);
          }
       }


        input.close();
    }*/

    }
}
/*
create a program that create a shopping list for the user. The program will ask the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items
	when the user is done creating the list print it

 */
