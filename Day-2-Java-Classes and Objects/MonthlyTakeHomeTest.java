import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyTakeHomeTest {

	private AnnualSalary monthlytakehome;
	@Before
	public void setUp()
	{
		monthlytakehome=new AnnualSalary();
		monthlytakehome.setMonthlybasic(10000);
	}
	@Test
	public void test() {
		assertEquals(15950,monthlytakehome.getMonthlyTakeHome(),0);
		
	}

}
