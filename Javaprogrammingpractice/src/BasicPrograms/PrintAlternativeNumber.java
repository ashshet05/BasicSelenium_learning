package BasicPrograms;
import java.util.Scanner;


public class PrintAlternativeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int n1=sc.nextInt();
		System.out.println("Enter the last range");
		int n2=sc.nextInt();
		
		for(int i=n1;i<=n2;i+=2)//Can be coverted into table by changing incremental addition
		{
			System.out.println(i);
		}
		
		

	}

}
