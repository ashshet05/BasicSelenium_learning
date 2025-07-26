package BasicConcepts;

class CoreJavaStudent
{
	void coding()
	{
		System.out.println("Core Java in depth knowledge");
	}
}

class SeleniumStudent extends CoreJavaStudent
{
	void automationTesting()
	{
		System.out.println("Automation Testing");
	}
}

class Company
{
	void interview(CoreJavaStudent ref)//Superclass ref variable
		{
			ref.coding();
		}
}




public class PassingObjectAsArgumentUpcasting {

	public static void main(String[] args) 
	{
		Company C=new Company();
		C.interview(new CoreJavaStudent());//same class object
		C.interview(new SeleniumStudent());//Upcasting==>passing subclass object as an argumemt to superclass ref variable

	}

}
