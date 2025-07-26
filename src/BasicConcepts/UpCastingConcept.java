package BasicConcepts;

class Employee
{
	double sal=1222534l;
	void work()
	{
		System.out.println("Office Work");
	}
}

class Person extends Employee
{
	void attitude()
	{
		System.out.println("Attitude");
	}
	
	void ego()
	{
		System.out.println("ego");
	}
}



public class UpCastingConcept {

	public static void main(String[] args) {
		// Upcasting==>subclass object hide its own property and behaves like superclass object and access the props. of superclass
		//Employee emp=new Person();
		Person p1=new Person();
		Employee emp=p1;// can directly assign subclass object to superclass ref. variable, address of p1 assigned to variable emp
		//(this format will be done to perform upcasting on existing object)
		emp.work();
		System.out.println(emp.sal);
	}

}
