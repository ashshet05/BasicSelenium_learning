package InterviewQuestionSolutions;

import java.util.Arrays;

public class AnagramSimpleProgram {

	public static void main(String[] args) {
String str1="Listen", str2="ssffea";
		
		if(str1.length()!=str2.length())
			System.out.println("Strings are not anagrams");
		else
		{
			str1=str1.replaceAll("\\s", "");
			str2=str2.replaceAll("\\s", "");
			
			char[] ch1=str1.toLowerCase().toCharArray();
			char[] ch2=str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
				System.out.println("Strings are anagrams");
			else
				System.out.println("Strings are not anagrams");
		}
	}

}
