package week10.earth;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
arth [classes, objects, static, ArrayList]
	I want to test our understanding of these topics on a deeper level. If you have trouble getting the idea by yourself wait until the review so we can break down each part. Move to the other practices of Encapsulation and inheritance
	Create these classes in order:
	- Create a class Person
		define these instance variables:
			name, age

	Create a class Earth

		define these instance variables:

		define these static variables:
			planet = Earth
			size = 40,075 km
			continent ArrayLists that store Person objects: Define an ArrayList for each continent:
				ArrayList<Person>
				(you dont' need to do all of them, pick some to test the code)
				Asia, Antarctica, North America, South America, Africa, Europe, Oceania
		use a static block to create the ArrayList objects with some initial people
		to test the code, print all the continents, access all the other static variables, make more Person objects and add them into a continent
	-------------------------------------------------------------------
 */
