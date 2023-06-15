package week2;

public class CastingExamble {
    public static void main(String[] args) {
        int i = 30;
        long l = i;

        long l2 = 100; // 100 is int and int is smaller so it automatically cast to long
        byte b2 = (byte) l2; // explicit casting

        int a1 = 1_000_000;
        byte a2 = (byte) a1; // the byte can not hold this number, there is data lose
        System.out.println(a2);// the result is based on calculation
       // float f5 = 10.2; // tring to store double as float
        float f5 = 10.2f;
        int i5 = (int)f5;
        System.out.println((double) f5);





    }
}
