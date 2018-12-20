import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DateTest {

	private Date date;
	@Before
	public void setUp()
	{
		date=new Date(10,06,2017);
	}
	@Test
	public void Stringtest() {
		assertEquals("10/10/2017",date.toString());
	}
	
	@Test
	public void IsSmallertest() {
		assertEquals(true,date.isSmaller(date));
	}

	@Test
	public void Differencetest() {
		int[] expected={5,2,1};
		assertArrayEquals(expected,date.diff(date));
	}
}
