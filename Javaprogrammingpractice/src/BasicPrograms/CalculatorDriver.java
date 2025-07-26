package BasicPrograms;
import java.util.Scanner;

public class CalculatorDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
		System.out.println("Enter your choice \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Modulus \n6.Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1: 
				{
					System.out.println("Enter first number");
					int a=sc.nextInt();
					System.out.println("Enter second number");
					int b=sc.nextInt();
					calculator.addition(a, b);
				}
					break;
			case 2: 
				{
					System.out.println("Enter first number");
					int a=sc.nextInt();
					System.out.println("Enter second number");
					int b=sc.nextInt();
					calculator.substraction(a, b);
				}
					break;
			case 3: 
				{
					System.out.println("Enter first number");
					int a=sc.nextInt();
					System.out.println("Enter second number");
					int b=sc.nextInt();
					calculator.multiplication(a, b);
				}
					break;		
			case 4: 
				{
					System.out.println("Enter first number");
					int a=sc.nextInt();
					System.out.println("Enter second number");
					int b=sc.nextInt();
					calculator.Division(a, b);
				}
					break;
			case 5: 
				{
					System.out.println("Enter first number");
					int a=sc.nextInt();
					System.out.println("Enter second number");
					int b=sc.nextInt();
					calculator.Modulus(a, b);
				};
					break;
			case 6: 
				{
					exit=false;
					System.out.println("Thank you...!");
				}
					break;
			default: System.out.println("inavlid choice");
					break;
		}
		}
		

	}

}
