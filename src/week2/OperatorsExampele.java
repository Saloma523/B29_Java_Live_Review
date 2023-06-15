package week2;

public class OperatorsExampele {
    public static void main(String[] args) {

        int age = 10;
        System.out.println(age++);
        System.out.println();

        int num = 5;
        System.out.println(++num);
        System.out.println(num++);
        int x = 15;
        int y = ++x;
        System.out.println("x" + x); // x = 15 => 16
        System.out.println("y" + y);// y ==15

        int z = 90;
        int w = --z;
        System.out.println("z" + z);// z = 90 => 89
        System.out.println("w" + w);// w = 89

        int a = 3; // ++a
        int b = 5;
         ++a;
         int c = a + b;
        System.out.println(c); // 4 + 5
    }
}
