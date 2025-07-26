package BasicPrograms;
import java.util.Scanner;

public class CheckTheGivenCharacter {

	public static void main(String[] args) 
	{
		//to check whether the given character is Alphabet/Number/Special Character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch=sc.next().charAt(0);
		
		String res=(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')?" is an alphabet":(ch>='0'&&ch<='9')?" is a number":" is special character";
		System.out.println(ch+res); 	

	}

}
