package BasicConcepts;

class Work
{
	void task(Object ob)
	{
		System.out.println("Object class type input argument");
		if(ob instanceof Company)
		{
			Company c1=(Company)ob;//Downcasted
			c1.interview(new CoreJavaStudent());//fetching the method of subclass , as it is downcasted
		}
		else
			System.out.println("cannot be downcasted");
	}
}

public class DownCastingInsideMethod 
{

	public static void main(String[] args) 
	{
		Work w1=new Work();
		w1.task(new Company());//Upcasted
		w1.task(new CoreJavaStudent());//CoreJavaStudent() did not upcasted to Object class so else statement will execute
	}
	

}
