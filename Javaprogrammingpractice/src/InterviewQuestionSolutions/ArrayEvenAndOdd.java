package InterviewQuestionSolutions;

public class ArrayEvenAndOdd {

	public static void main(String[] args) 
	{
		int[] a= {2,3,4,6,12,15,17,21,30};
		
		int even=0, odd=0;
		System.out.println("Even numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				even++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nOdd numbers are: ");
		for(int i=0;i<a.length;i++)
		{	 
			if(a[i]%2!=0)
			{
				odd++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nEven: "+even+ "\nOdd: "+odd);

	}
	
	    /*public static void main(String[] args) {
	        int[] numbers = {10, 23, 45, 66, 90, 17, 32};

	        System.out.println("Even numbers in the array:");
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }

	        System.out.println("\nOdd numbers in the array:");
	        for (int num : numbers) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }*/

}
