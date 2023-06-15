package week10.amazon;

public class useAmazon {
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("javaiscoo", "javal4le@gmail.com",false);

        System.out.println(account1.getEmail());
        account1.setEmail("saloma@gmail.com");
    }
}
