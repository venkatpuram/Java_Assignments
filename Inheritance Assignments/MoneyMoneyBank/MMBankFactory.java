package MoneyMoneyBank;

public class MMBankFactory extends BankFactory{

	@Override
	public MMSavingAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalary) {
		
		return new MMSavingAccount(accountHolderName,accountBalance,isSalary);
	}

	@Override
	public MMCurrentAccount getNewCurrentAccount(
			String accountHolderName, double accountBalance,
			double creditLimit) {
		
		return new MMCurrentAccount(accountHolderName,accountBalance,creditLimit); 
	}

	
}
