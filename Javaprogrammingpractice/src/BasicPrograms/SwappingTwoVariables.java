package BasicPrograms;

public class SwappingTwoVariables {

	public static void main(String[] args) {
		// Swapping 2 variables using 3rd variable
		int a=10;
		int b=20;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a="+a+"\nValue of b="+b);
		
		//Swapping vaiables without using 3rd variable
		
		int num1=20;
		int num2=30;
		
		num1=num1+num2;//50
		num2=num1-num2;//50-30=20
		num1=num1-num2;//50-20=30
		
		System.out.println("Num1="+ num1+"\nNum2="+num2);
	}

}
