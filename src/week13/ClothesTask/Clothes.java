package week13.ClothesTask;

public abstract class Clothes {

   abstract void wear();


}
/*
Clothes [abstraction, polymorphism, ArrayList]

    create an abstract class Clothes
	create an abstract method wear()

    create a class TShirt
	inherits the Clothes class
    implement the wear() method

    create an interface HasHood
	create an abstract method putOnHood()

    create a class Jacket
	inherits the Clothes class
	implements the HasHood interface
    implement the wear() & putOnHood() methods

    Extra: Create a extra classes: hat, coat, sock, hoodie

    create a class Store
	create a main method and create TShirt and Jacket objects
            create an ArrayList of Clothes. Add the different objects
    iterate through the ArrayList and call the wear() method
 */