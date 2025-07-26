package BasicConcepts;

class Person1
{
	public void m1()
	{
		System.out.println("Test");
	}
}
class Fake
{
	public int hashCode()
	{
		return 123455;
	}
}
public class HashCodeEx {

	public static void main(String[] args) 
	{
		Person1 p1=new Person1();
		System.out.println(p1.hashCode());
		
		Fake p2=new Fake();
		System.out.println(p2.hashCode());
		
	}

}
