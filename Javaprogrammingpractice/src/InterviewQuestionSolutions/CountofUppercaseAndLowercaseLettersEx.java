package InterviewQuestionSolutions;

public class CountofUppercaseAndLowercaseLettersEx {

	public static void main(String[] args) 
	{
		String s="Welcome To AutOMAtion1";
		
		//int lower=0,upper=0;
		String lower="",upper="";
		
		for(int i=0;i<s.length();i++)
		{
			//Count of character
			/*char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				upper++;
			}
			else if(ch>='a'&&ch<='z')
				lower++;*/
			
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				upper=upper+ch;
			else if(ch>='a'&&ch<='z')
				lower=lower+ch;
				
			
		}
		System.out.println("Uppper: "+upper+"\nLower: "+lower);
		

	}

}
