
public class PaymentGateway {

	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, int amount)
	{
		if(sender.getAccountbalance()>amount)
		{
			sender.withdraw(amount);
			receiver.deposit(amount);
			return true;
		}
		return false;
	}
}
