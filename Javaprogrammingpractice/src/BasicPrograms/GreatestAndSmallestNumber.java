package BasicPrograms;

public class GreatestAndSmallestNumber {

	public static void main(String[] args) {
		// comparing 3 numbers
		int n1=2;
		int n2=8;
		int n3=0;
		
		//Greatest
		if(n1>n2 && n1>n3)
			System.out.println(n1+ " is greatest");
		
		else if(n2>n3)
			System.out.println(n2+ " is greatest");
		else
			System.out.println(n3+ " is greatest");
		
		//Greatest using conditional operator
		int greatest=(n1>n2 && n1>n3)?n1:((n2>n3)?n2:n3);
		System.out.println("Greatest Number ="+greatest);
		
		//Smallest
		if(n1<n2 && n1<n3)
			System.out.println(n1+ " is Smallest");
		
		else if(n2<n3)
			System.out.println(n2+ " is Smallest");
		else
			System.out.println(n3+ " is Smallest");	
		
		int smallest=(n1<n2 && n1<n3)?n1:((n2<n3)?n2:n3);
		System.out.println("Smallest "+smallest);

	}

}
