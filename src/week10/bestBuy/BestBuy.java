package week10.bestBuy;

public class BestBuy {
    public String address;
    public double grossIncome;
    public double expenses;

    public static String ceo;
    public static String hq ;
    public static double revenue;

    static {// static block can do more than assigning
        ceo = "Corie Barry";
        hq = "Richfield, Minnesota";
        revenue = 51.76;
    }
    {
        System.out.println("istance block");
    }

    public BestBuy(String address, double grossIncome, double expenses) {
        System.out.println("CONSTRUCTOR RUNNING");
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    public double reportProfits(){
        double result = 0;
        result = grossIncome - expenses;
        return revenue + result;
    }

    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                '}';
    }
}
/*
BestBuy [static]
	Create a class BestBuy
		define these instance variables:
			address, gross income, expenses
		define these static variables:
			ceo: Corie Barry
			hq: Richfield, Minnesota
			revenue: 51.76 billion
		create an instance method:
			reportProfits()
				use the income of the location and reduce the expenses. Add the result to the total revenue of all BestBuy stores
		create a class to run the code and create BestBuy objects
 */
