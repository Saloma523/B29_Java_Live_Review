package week06;

public class address {

    public String street;
    public String city;
    public String state;
    public int zipcode;
    public String county;

    public void setInfo(String street, String city, String state, int zipcode, String county) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.county = county;
    }


    public String toString() {
        return "address{" +
                 street + '\n' + city + ", " +  state + ", " + zipcode + '\n' + county + '\'' +
                '}';
    }
}
/*
Address [object type]
	create a class called Address
	declare these instance variables:
		street, city, state, zipcode, country
	create a setInfo() method to initialize these variables
	create a toString() that shows the full address in the following format
		$street
		$city, $state $zipcode
		$country
	create a different class and create some Address objects

 */
