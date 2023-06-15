package week14;

public class ExceptionExample {

    public static void main(String[] args)throws InterruptedException{

        try{
            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("string cannot be null");
            System.out.println("do these steps");
        }

        System.out.println("end");

        System.out.println("----------------------------------------");


        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");

    }
}
