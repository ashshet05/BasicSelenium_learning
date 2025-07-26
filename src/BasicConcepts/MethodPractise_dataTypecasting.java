package BasicConcepts;

public class MethodPractise_dataTypecasting{
	public static void Test() {
		System.out.println("Test Method");
		Result();
	}
	public static void Result() {
		System.out.println("Result Method");
	}
	
	public static void main(String[] args) {
	Test();
	
	int c=(int)3.5;
	System.out.println(c);
	
	int d='A';//Internal casting
	System.out.println(d);
	
	char e=555;
	System.out.println(e);
	
	float f='&';
	System.out.println(f);
	
	char t=(char)98.6f;
	System.out.println(t);
	
	char s=(char)4343545455l;
	System.out.println(s);
	
	long num=324;//Widening
	double ch='a';//widening
	System.out.println(ch);
	
	float y=(float)2.3;
	
	int r=(int)435467845555l;

	// we can get unicode value using typecasting
	System.out.println((int)'r'+","+(int)'A');
	System.out.println((char)112);
	
	byte n=(byte)256;
	System.out.println(n);
	
	
	}

}
