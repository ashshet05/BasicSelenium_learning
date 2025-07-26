package BasicPrograms;
import java.util.Scanner;

public class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("The table for "+num+" is");
		for(int i=1;i<=10;i++)
		{
			//int res=num*i;
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

}
