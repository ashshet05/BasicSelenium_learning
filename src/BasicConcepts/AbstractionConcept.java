package BasicConcepts;


interface Zomato //Generalize the common props. of implementation class and store it in interface
{
	void menu();
	void takeOrder();
	void deliver();
}
//Object implementation layer
class Dominos implements Zomato // Provide implementation to the abstract methods of interface in implementation class
{
	public void menu()
	{
		System.out.println("Welcome to Dominos");
		System.out.println("Pizza");
		System.out.println("Softdrinks");
	}
	public void takeOrder()
	{
		System.out.println("Take order");
		System.out.println("Handover the order");
		
	}
	public void deliver()
	{
		System.out.println("Collect the order and deliver to customer");
	}
}

class SpicyRevenge implements Zomato // Provide implementation to the abstract methods of interface in implementation class
{
	public void menu()
	{
		System.out.println("Welcome to Dominos");
		System.out.println("Chicken");
		System.out.println("Lemon Soda");
	}
	public void takeOrder()
	{
		System.out.println("Take order");
		System.out.println("Handover the order");
		
	}
	public void deliver()
	{
		System.out.println("Collect the order and deliver to customer");
	}
}

//Object creation layer
class ZomatoApp
{
	Zomato selectRestaurant(char ch)
	{
		if (ch=='d')
			return new Dominos();
		else
			return new SpicyRevenge();
	}
}

//Object utilization layer
public class AbstractionConcept 
{

	public static void main(String[] args) 
	{
		ZomatoApp zp=new ZomatoApp();
		Zomato ref=zp.selectRestaurant('e');//create object of implementation class and store it in interface ref. variable
		ref.menu(); //access the methods of implementation class using interface ref. variable
		ref.takeOrder();
		ref.deliver();
	}

}// it ultimately achieved runtime polymorphism ==>Inheritence, Method overriding, upcasting
