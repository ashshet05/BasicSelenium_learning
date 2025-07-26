package BasicPrograms;
import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
	
		System.out.println("Factorial of "+num+" is: !"+num);
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;		
		}
		System.out.println(fact);
	}

}
