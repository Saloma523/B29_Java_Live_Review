package week11.discordUserTask;

import java.time.LocalDate;

public class DiscordUser {

    String role;
    String name;
    int id;
    LocalDate creatDate;

    //public DiscordUser(){} //no argument constructor

    public DiscordUser(String role, String name, int id, LocalDate creatDate) {
        this.role = role;
        this.name = name;
        this.id = id;
        this.creatDate = creatDate;
    }

    public void sendMessage(){
        System.out.println("sending message to class chat");
    }

    public void joinDiscord(String discordUrl){
        System.out.println("joining " + discordUrl);
    }

    @Override
    public String toString() {
        return name + "#" + id + role + "\nAcount created " + creatDate;
    }
}
/*
iscordUser [Inheritance, overriding, super constructor, LocalDate]

	Create an DiscordUser class

	    - create variables:
	        role, name, id
	        variable: account creation date

	    - create constructor to initialize the variables

	    - create a method sendMessage()
	    	prints: "Sending message to class chat"

	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"

	    - override toString()

	Create a class Admin

	    - Admin class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

	    - create method:
	        createChannel()
	            Example output: prints Creating new discord channel

	    - override the sendMessage() to print: "Sending announcement"

	Create a class Student

	    - Student class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Student, name, id)

	    - overload the sendMessage(String name) to accept a String for the chat name
	    	print Sending message to $name

	------------------------------
 */
