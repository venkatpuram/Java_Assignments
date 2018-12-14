import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualTakeHomeTest {

	private AnnualSalary annualtakehome;
	@Before
	public void setUp()
	{
		annualtakehome=new AnnualSalary();
		annualtakehome.setMonthlybasic(10000);
	}
	@Test
	public void test() {
		assertEquals(191400,annualtakehome.getAnnualTakeHome(),0);
		
	}
	

}
