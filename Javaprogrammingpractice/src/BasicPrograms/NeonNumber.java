package BasicPrograms;
import java.util.Scanner;

public class NeonNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		
		int product=num*num;
		while(product!=0)
		{
			int res=product%10;
			sum=sum+res;
			product=product/10;
		}
		if (sum==num)
		{
			System.out.println(num+ " is neon number");
		}
		else
		{
			System.out.println(num+ " is not a neon number");
		}
	}

}
