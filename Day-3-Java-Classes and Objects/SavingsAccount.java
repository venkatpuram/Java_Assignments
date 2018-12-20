
public class SavingsAccount {

	private String Accountholdername;
	private int accountbalance;
	private static int accountnumber=101;
	private int nextaccountnumber;
	
	public static int getAccountnumber() {
		return accountnumber;
	}
	public static void setAccountnumber(int accountnumber) {
		SavingsAccount.accountnumber = accountnumber;
	}
	public int getNextaccountnumber() {
		return nextaccountnumber;
	}
	public void setNextaccountnumber(int nextaccountnumber) {
		this.nextaccountnumber = nextaccountnumber;
	}
	public SavingsAccount()
	{
		this.nextaccountnumber=accountnumber;
		accountnumber++;
	}
	public int accountNumber()
	{
		return nextaccountnumber;
	}
	
	public String getAccountholdername() {
		return Accountholdername;
	}
	
	public void setAccountholdername(String accountholdername) {
		Accountholdername = accountholdername;
	}
	
	public int getAccountbalance() {
		return accountbalance;
	}
	
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	public int withdraw(int withdrawamount)
	{
		if(accountbalance>=withdrawamount){
			accountbalance -= withdrawamount;
			return accountbalance;
		}else
			return accountbalance;
		
	}
	
	public int deposit(int depositamount)
	{
		accountbalance += depositamount;
		return accountbalance;
	}
}
