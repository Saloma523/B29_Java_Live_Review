package week3;

import org.w3c.dom.ls.LSOutput;

public class result {
    public static void main(String[] args) {
        int num = 10;
        if(--num == 10){
            System.out.println("Hello world" + num);
        }else{
            System.out.println("hello Cydeo" + num);
        }
        System.out.println("---------------------------");
        int num2 = 10;
        if(num++ == 10){
            System.out.println("Hello world" + num);
        }else{
            System.out.println("Hello cydeo" + num);
        }

    }






}

