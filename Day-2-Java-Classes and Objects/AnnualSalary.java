
public class AnnualSalary {
	
	private static float pfRate;

	public static float getPfRate() {
		return pfRate;
	}
	public static void setPfRate(float pfRate) {
		AnnualSalary.pfRate = pfRate;
	}
	
	private int id;
	private String name;
	private int monthlybasic;
	private int medicalallowance=1250;
	private int conveyanceallowance=800;
	private int hra;
	private int pf;
	private int esic;
	private int professionaltax;
	
	void AnnualSalary(){
		
	}
	public int hra()
	{
		int monthlyhra=(getMonthlybasic()/2);
		return monthlyhra;
	}
	public int pf()
	{
		int monthlypf=(getMonthlybasic()/10);
		if(monthlypf>=6500)
		{
			return 6500;
		}else
		{
			return monthlypf;
		}
	}
	public double esic()
	{
		double monthlyesic = 0 ;
		if(monthlybasic<=5000)
			monthlyesic=((getMonthlybasic()*4.75)/100);
		return monthlyesic;
	}
	public int professionaltax()
	{
		int monthlyproftax=getMonthlyGrossSalary();
		if(monthlyproftax<=10000)
		{
			return 50;
		}else
		{
			return 100;
		}
	}

	public int getAnnualBasic() {
		int annualbasic=(12 * getMonthlybasic());
		return annualbasic;
	}
	public int getMonthlyGrossSalary(){
		int finalhra=hra();
		int monthlygross= (getMonthlybasic()+finalhra+medicalallowance+conveyanceallowance);
		return monthlygross;
	}
	public int getAnnualGrossSalary(){
		int monthlygross=getMonthlyGrossSalary();
		int annualgross=monthlygross*12;
		return annualgross;
	}
	public double getMonthlyDeductions(){
		int finalpf=pf();
		double finalesic=esic();
		int proftax=professionaltax();
		double monthlydeduction=finalpf+finalesic+proftax;
		return monthlydeduction;
	}
	public double getMonthlyTakeHome(){
		int monthlygross=getMonthlyGrossSalary();
		double monthlydeduction=getMonthlyDeductions();
		double monthlytakehome=monthlygross-monthlydeduction;
		return monthlytakehome;
	}
	public double getAnnualTakeHome(){
		double monthlytakehome=getMonthlyTakeHome();
		double annualtakehome=monthlytakehome*12;
		return annualtakehome;
	}
	public int getMonthlybasic() {
		return monthlybasic;
	}
	public void setMonthlybasic(int monthlybasic) {
		this.monthlybasic = monthlybasic;
	}
	
	public float setGetPf(){
		float pfCalculation=(monthlybasic*AnnualSalary.getPfRate())/100;
		if(pfCalculation<=6500)
		 pfCalculation = 6500;
		return pfCalculation;	

	}

}
