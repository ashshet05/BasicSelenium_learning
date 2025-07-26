package BasicConcepts;


class Program1
{
	void test(Object ob)
	{
		System.out.println(ob);
		
	}
}
class Day1
{
	void brain()
	{
		System.out.println("Java is difficult");
	}
}
class Today extends Day1
{
	void brain()//Method Overriding
	{
		System.out.println("Java is easy");
	}
}
public class ObjectTypeAndOverridenMethods_Upcast {

	public static void main(String[] args) 
	{
		Program1 p1=new Program1();
		p1.test(new Company());
		p1.test(new CoreJavaStudent());
		p1.test(new Employee());
		
		Day1 d=new Today();//Upcasting==>in case of overriden method of subclass will be executed and rest will be hidden
		d.brain();
	}	

}
