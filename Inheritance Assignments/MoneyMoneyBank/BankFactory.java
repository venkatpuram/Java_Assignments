package MoneyMoneyBank;

public abstract class BankFactory {
	
	public abstract CurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit);

	public  abstract SavingAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalary); 
	
	
	
	
}
