package week10.traficLight;

public class useTrafficLight {
    public static void main(String[] args) {

        TraficLight traficLight = new TraficLight("purple");
        System.out.println(traficLight.getColor());
        traficLight.setColor("red");
        System.out.println(traficLight.getColor());
        traficLight.setColor("yellow");
        System.out.println(traficLight.getColor());

        System.out.println("-------------------------------------------------");

        System.out.println(new TraficLight("hello").getColor());// null
    }

}
