package BasicPrograms;

public class IncrementOrDecrementOperator {

	public static void main(String[] args) 
	{
		int i=8;
		while(i++<=10)
		{
			i++;
		}
		System.out.println(i);	
		
		int a=7;
		int b=8;
		int res=a+ --a + ++b - a++;
		System.out.println(res);
		
		int c=7;
		c=c++;
		System.out.println(c);
	}
	
	

}
