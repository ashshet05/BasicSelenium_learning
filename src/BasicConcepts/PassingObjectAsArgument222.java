package BasicConcepts;

class DebitCard
{
	int cardNum=32322;
	void drawCash()
	{
		System.out.println("Withdraw the cash");
	}
	
}

class Bank
{
	void atm(DebitCard ref)
	{
		System.out.println("Welcome to ATM");
		System.out.println(ref.cardNum);
		ref.drawCash();
	}
	
}


public class PassingObjectAsArgument222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.atm(new DebitCard());
	}

}
