package BasicConcepts;

class TelecomRegulatory
{
	void network()
	{
		System.out.println("Identify the network");
	}
}
class BSNL extends TelecomRegulatory //Heirachial Inhetitence
{
	void network()//Method overriding
	{
		System.out.println("BSNL Network activated");
	}
}
class Airtel extends TelecomRegulatory //Heirachial Inhetitence
{
	void network()//Method overriding
	{
		System.out.println("Airtel Network activated");
	}
}
class Jio extends TelecomRegulatory //Heirachial Inhetitence	
{
	void network()//Method overriding
	{
		System.out.println("Jio Network activated");
	}
}

class Router
{
	void receiver(TelecomRegulatory ref)//Superclass
	{
		ref.network();
	}
}
public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		Router rt=new Router();
		rt.receiver(new BSNL());//Upcasted==>Passing subclass object
		rt.receiver(new Airtel());
		rt.receiver(new Jio());
	}
}
