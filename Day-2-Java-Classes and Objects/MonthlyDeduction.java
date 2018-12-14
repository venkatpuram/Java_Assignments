import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyDeduction {
	
	private AnnualSalary monthlydeduction;
	@Before
	public void setUp()
	{
		monthlydeduction=new AnnualSalary();
		monthlydeduction.setMonthlybasic(10000);
	}
	@Test
	public void test() {
		
		assertEquals(1100,monthlydeduction.getMonthlyDeductions(),0);
	}

}
