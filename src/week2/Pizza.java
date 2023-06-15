package week2;

public class Pizza {
    /*
    Pizza [variables, operators, concatenation]

	Declare and assign the following variables
		type (type of pizza), slices (how many slices the pizza has), and people (the number of people eating this pizza)

	Calculate how many slices each person will get and how many are left over. Print the output in this format:

		We ordered a $type pizza with $slices slices. $number_of_people people ate $each_share slices each, so there was $remainder slices left

		Ex: We ordered a cheese pizza with 8 slices. 3 people ate 2 slices each, so there were 2 slices left
     */
    public static void main(String[] args) {

        String type = "Cheese";
        int  slices = 8;
        int people = 3;


        String summary = "We ordered a " + type + " pizza with " + slices + " slices. " + "people ate " + (slices/people) + " slices each, so there were " + (slices % people) + " slices left";


        System.out.println(summary);


    }

}
