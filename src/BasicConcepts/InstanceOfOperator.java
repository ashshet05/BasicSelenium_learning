package BasicConcepts;

class Ver1
{
	int a=10;
	void run()
	{
		System.out.println("Run method");
	}
}
class Ver2 extends Ver1
{
	int b=20;
	void task()
	{
		System.out.println("Task method");
	}
}
class Ver3 extends Ver2
{
	int c=30;
	void count()
	{
		System.out.println("Count method");
	}
}
public class InstanceOfOperator 
{

	public static void main(String[] args) 
	{
		Ver1 v1=new Ver2();
		if (v1 instanceof Ver3) 
		{
			System.out.println("Downcasting is successful");
			Ver3 v3=(Ver3)v1;
		}
		else
			System.out.println("Cannot be downcasted");

	}

}
