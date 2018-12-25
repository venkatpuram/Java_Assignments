package MoneyMoneyBank;

public class InvalidAmountException extends RuntimeException {

	public InvalidAmountException()
	{
		
	}
	public InvalidAmountException(String Message)
	{
		super(Message);
	}
}
