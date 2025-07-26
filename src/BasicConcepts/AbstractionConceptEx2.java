package BasicConcepts;

import java.nio.file.attribute.UserPrincipal;

interface UpiTransaction
{
	void sendMoney();
	void receiveMoney();
	void checkBalance();
}

class GPay implements UpiTransaction
{
	public void sendMoney()
	{
		System.out.println("Send money through Gpay");
	}
	public void receiveMoney()
	{
		System.out.println("Receive Money sent through GPay");
	}
	public void checkBalance()
	{
		System.out.println("Check the balance in GPay");
	}
}
class phonePay implements UpiTransaction
{
	public void sendMoney()
	{
		System.out.println("Send money through Phone pay");
	}
	public void receiveMoney()
	{
		System.out.println("Receive Money sent through Phone pay");
	}
	public void checkBalance()
	{
		System.out.println("Check the balance in Phone pay");
	}
}
	
class User
{
	UpiTransaction makePayment(char payment)
	{
		if(payment=='G')
			return new GPay();
		else
			return new phonePay();	
	}
}
	
public class AbstractionConceptEx2 
{

	public static void main(String[] args) 
	{
		User user=new User();
		UpiTransaction ref=user.makePayment('y');
		ref.sendMoney();
		ref.receiveMoney();
		ref.checkBalance();
	}

}
