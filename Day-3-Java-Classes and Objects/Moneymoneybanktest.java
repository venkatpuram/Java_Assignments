import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Moneymoneybanktest {

	private SavingsAccount account,account1,account2,account3;
	private PaymentGateway payment;

	@Before
	public void setUp()
	{
		account=new SavingsAccount();
		account1=new SavingsAccount();
		account.setAccountbalance(6000);
		account.setAccountholdername("venkat");
		account1.setAccountbalance(7000);
		account1.setAccountholdername("harish");
		payment=new PaymentGateway();
		
		
	}
	@Test
	public void withdrawtest() {
		assertEquals(0,account.withdraw(6000));
	}
	@Test
	public void Deposittest() {
		assertEquals(9000,account.deposit(3000));
	}
	@Test
	public void paymentGatewaytest() {
		assertEquals(true,payment.transfer(account,account1,3000));
		assertEquals(3000,account.getAccountbalance());
		assertEquals(10000,account1.getAccountbalance());
	}
	@Test
	public void test()
	{
		assertEquals(103,account.accountNumber());
		
	}
}
