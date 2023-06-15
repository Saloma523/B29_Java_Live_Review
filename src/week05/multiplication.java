package week05;

public class multiplication {
    public static void main(String[] args) {
        multiplicationTable(1,5);
    }

   /* public static void multiplicationTable(int num){
        for(int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));
        }}*/
   public static void  multiplicationTable(int num){
       multiplicationTable(num,5);
   }



    public static void multiplicationTable(int num, int limit){
        for(int i = 1; i <= limit; i++){
            System.out.println(num +" x " + i + " = " + (num * i));

        }

    }
}
/*
Multiplication Table [methods, loops]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

 */
