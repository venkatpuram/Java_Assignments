import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualGrossTest {

	private AnnualSalary annualgross;
	private AnnualSalary annualgross1;
	@Before
	public void setUp()
	{
		annualgross=new AnnualSalary();
		annualgross1=new AnnualSalary();
		annualgross.setMonthlybasic(10000);
		annualgross1.setMonthlybasic(20000);
	}
	@Test
	public void test1() {
		assertEquals(204600,annualgross.getAnnualGrossSalary());
	}
	@Test
	public void test2() {
		assertEquals(384600,annualgross1.getAnnualGrossSalary());
	}

}
