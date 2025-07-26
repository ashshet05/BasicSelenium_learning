package BasicPrograms;


public class calculator 
{
	public static void addition(int a, int b)
	{
		int res=a+b;
		System.out.println(a+" + "+b+"="+res);
	}
	
	public static void substraction(int a, int b)
	{
		int res=a-b;
		System.out.println(a+ "-"+b+"="+res);
	}

	public static void multiplication(int a, int b)
	{
		int res=a*b;
		System.out.println(a+ "*"+b+"="+res);
	}
	
	public static void Division(int a, int b)
	{
		int res=a/b;
		System.out.println(a+ "/"+b+"="+res);
	}
	public static void Modulus(int a, int b)
	{
		int res=a%b;
		System.out.println(a+ "%"+b+"="+res);
	}
}
