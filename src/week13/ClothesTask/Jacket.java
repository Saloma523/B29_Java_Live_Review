package week13.ClothesTask;

public class Jacket extends Clothes implements HasHood{


    @Override
    void wear() {

        System.out.println("wearing a jacket");
    }

    @Override
    public void putOnHood() {

        System.out.println("putting on a hood");
    }
}
/*
 create a class Jacket
	inherits the Clothes class
	implements the HasHood interface
    implement the wear() & putOnHood() methods
 */