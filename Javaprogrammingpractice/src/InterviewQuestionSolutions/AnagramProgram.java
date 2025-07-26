package InterviewQuestionSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) 
	{
		System.out.println("Enter the first String\n");
		Scanner sc=new Scanner(System .in);
		String str1=sc.nextLine();
		System.out.println("Enter the Second String\n");
		String str2=sc.nextLine();
		
		boolean res=isAnagram(str1,str2);
		if(res)
			System.out.println("Strings are anagrams");
		else 
			System.out.println("Strings are not angrams");
			
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		
		if(s1.length()!=s2.length())
			return false;
		else
		{
			char[] str1=s1.toLowerCase().toCharArray();
			char[] str2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			return(Arrays.equals(str1, str2));
			
		}
		
		
	}
	
}
