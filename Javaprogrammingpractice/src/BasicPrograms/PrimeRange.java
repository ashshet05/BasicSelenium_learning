package BasicPrograms;
import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the start number");
		int start=sc.nextInt();
		System.out.println("Please enter the Last number");
		int last=sc.nextInt();
		for(int i=start;i<=last;i++)
		{
			if(PrimeNum(i)==2)
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static int PrimeNum(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
				
		}
		return count;
		
	}

}


	

