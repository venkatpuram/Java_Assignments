import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyGrossTest {

	private AnnualSalary monthlygross;
	private AnnualSalary monthlygross1;
	@Before
	public void setUp()
	{
		monthlygross=new AnnualSalary();
		monthlygross1=new AnnualSalary();
		monthlygross.setMonthlybasic(20000);
		monthlygross1.setMonthlybasic(10000);
		

	}
	@Test
	public void test1() {
		assertEquals(32050,monthlygross.getMonthlyGrossSalary());
	}
	@Test
	public void test2() {
		assertEquals(17050,monthlygross1.getMonthlyGrossSalary());
	}

}
