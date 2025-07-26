package BasicConcepts;

class DebitCard1
{
	int cardNum=32322;
	void drawCash()
	{
		System.out.println("Withdraw the cash");
	}
	
}

class Bank1
{
	void atm(DebitCard1 ref)
	{
		System.out.println("Welcome to ATM");
		System.out.println(ref.cardNum);
		ref.drawCash();
	}
	
}


public class PassingObjectAsArgument222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 b=new Bank1();
		b.atm(new DebitCard1());
	}

}
