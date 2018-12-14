import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SetGetPfTest {

	private AnnualSalary setgetpf;
	@Before
	public void setUp()
	{
		setgetpf=new AnnualSalary();
		setgetpf.setPfRate(4);
		setgetpf.setMonthlybasic(10000);
	}
	@Test
	public void setGetPfTest() {
		float setGetPfTest=setgetpf.setGetPf();
		assertEquals(6500,setGetPfTest,00);
	}
}
