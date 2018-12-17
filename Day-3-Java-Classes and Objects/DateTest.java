import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DateTest {

	private Date date;
	@Before
	public void setUp()
	{
		date=new Date(13,06,2017);
	}
	@Test
	public void Stringtest() {
		assertEquals("13/6/2017",date.toString());
	}
	
	@Test
	public void IsSmallertest() {
		assertEquals(true,date.isSmaller(date));
	}

	@Test
	public void Differencetest() {
		int[] expected={2,2,1};
		assertArrayEquals(expected,date.diff(date));
	}
}
