package BasicConcepts;



public class EncapsulationExample 
{

	public static void main(String[] args) 
	{
		EncapsOperation enOp=new EncapsOperation("Surgical Strike",10 , 344.35466f);
		String na=enOp.getName();
		System.out.println(na);
		int size=enOp.getSize();
		System.out.println(size);
		float loc=enOp.getLocation();
		System.out.println(loc);
		
		System.out.println("Set loaction again");
		enOp.setLocation(45654.54848f);
		
	}

}
