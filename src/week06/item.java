package week06;

public class item {

    public String name;
    public int quantity;
    public double unitPrice;

    public void setInfo(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    public void sellItem(int items){

        if(quantity >= items){
            double totalPrice = items * unitPrice;
            System.out.println("totalPrice is: " + totalPrice);
            quantity-=items;
            System.out.println("quantity left: " + quantity);
        }else{
            System.out.println("sory we have only: " + quantity);
        }
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
/*
Item [object type]
	create a class called Item
	declare these instance variables:
		name, quantity, unitPrice
	create a setInfo() method to initialize these variables
	create a sellItem method that will accept an argument for how many items you want to buy
		first check if there is enough quantity left of the item
			if there is enough print:
				Selling: $quantity $name for $totalPrice
					- calculate the totalPrice by doing the quantity being bought and unitPrice
					- afterward reduce the quantity of the item from how many were sold
	create a toString() that shows the item information in the following format:
		ITEM: $name | $quantity | $unitPrice
	create a different class and create some Item objects

 */
