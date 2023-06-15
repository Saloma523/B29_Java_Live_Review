package week11.Access;

public class Computer {

    public String os;
    protected int memory;
    String brand;
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
/*
Computer [Inheritance, access modifiers]
	Follow the steps to practice using the concepts and see how they work in the code

	Create a package access.a
	Create a class Computer in package access.a
		define the instance variables with access modifiers:
			os - public
			memory - protected
			brand - default
			has wifi card - private

		create a toString

	Create a class Windows in package access.a
		inherit the Computer class
		make a main method and create a Windows object. Check to see which variables are accessible

	Then make a class Runner in package access.a
		make a main method and create a Windows object. Check to see which variables are accessible based on their access modifier

	Create a package access.b
	Create a class Mac in package access.b
		inherit the Computer class
		make a main method and create a Mac object. Check to see which variables are accessible

	Create a RunnerB in package access.b
		make a main method and create a Mac object. Check to see which variables are accessible

 */