package BasicConcepts;

class Demo1
{
	protected void run()
	{
		System.out.println("Run method");
	}
}

class Demo2 extends Demo1
{
	public void run()
	{
		System.out.println("Overridden run method");
	}
}
public class MethoOverridingWithSpecifiers 
{
	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2();
		d1.run();
		
	}

}
