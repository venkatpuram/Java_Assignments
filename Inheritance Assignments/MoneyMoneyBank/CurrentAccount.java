package MoneyMoneyBank;

public abstract class CurrentAccount extends BankAccount {

	private final double creditLimit;
	public double getCreditLimit() {
		return creditLimit;
	}

	public CurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit=creditLimit;
		
	}
	
	@Override
	public abstract void withdraw(double withdrawamount) throws InsufficientFundsException;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	} 

}
