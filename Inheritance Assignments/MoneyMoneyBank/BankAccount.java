package MoneyMoneyBank;

public abstract class BankAccount {

	private static int accountNumber=1000;
	private String accountHolderName;
	private double accountBalance;
	{
		accountNumber = accountNumber++;
	}
	
	public int accountNumberDisplay()
	{
		return accountNumber;
	}
	
	public BankAccount(String accountHolderName, double accountBalance) {
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}
	
	public abstract void withdraw(double withdrawamount) throws Exception;
	
	public void deposit(double depositamount) throws Exception
	{
		if(depositamount>0)
			accountBalance +=depositamount;
		else
			throw new InvalidAmountException("Invalid Amount");
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


}
