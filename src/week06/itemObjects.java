package week06;

public class itemObjects {
    public static void main(String[] args) {

        item item1 = new item();

        item1.setInfo("chargers",4,5.99);

        System.out.println(item1);

        item1.sellItem(3);

    }
}
