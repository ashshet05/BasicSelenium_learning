package BasicPrograms;
import java.util.Scanner;

class StrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter strong number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(temp!=0)
		{
			int fact=1;
			int r=temp%10;
			for(int i=r;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		
		if(sum==num)
		{
			System.out.println(num+" is strong number");
		}
		else
		{
			System.out.println(num+ " is not a strong number");
		}

	}

}
