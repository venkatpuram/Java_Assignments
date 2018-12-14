import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualBasicTest {

	private AnnualSalary annualsalary;
	private AnnualSalary annualsalary1;
	@Before
	public void setUp()
	{
		annualsalary=new AnnualSalary();
		annualsalary1=new AnnualSalary();
		annualsalary.setMonthlybasic(20000);
		annualsalary1.setMonthlybasic(15000);
	}
	@Test
	public void test() {
		assertEquals(240000,annualsalary.getAnnualBasic());
	}
	@Test
	public void test1() {
		assertEquals(180000,annualsalary1.getAnnualBasic());
	}

}
