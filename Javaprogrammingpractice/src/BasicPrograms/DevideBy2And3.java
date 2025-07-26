package BasicPrograms;
import java.util.Scanner;

public class DevideBy2And3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and check whether number is divisible by both 2 & 3");
		int num=sc.nextInt();
		
		String res=(num%2==0 && num%3==0)?" Num is divisible by both 2&3":"Num is not divisible by both 2& 3";
		System.out.println(num+res);
		
		
	}

}
