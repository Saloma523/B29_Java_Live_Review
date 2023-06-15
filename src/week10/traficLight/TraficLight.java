package week10.traficLight;

public class TraficLight {

    private String color;// when no access modifier is given it will be default access

    public TraficLight(String color) {
      setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")) {
            this.color = color;
        }
    }
}
/*
TrafficLight [Encapsulation]
	Create a class Traffic Light
	instance variable: color (String)
	the constructor should called the setter method
	encapsulate the class
		in the setter: only set the color if it is green, red, or yellow
	-----------------------------------------------------------
 */
