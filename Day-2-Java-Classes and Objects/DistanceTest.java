import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceTest {

	private Distance distance;
	private Distance distance1;
	@Before
	public void setUp()
	{
		distance=new Distance(4.3,6.2);
		distance1=new Distance(4.5,3.4);
	}
	@Test
	public void testDistance() {
		String result="8.8feet9.6inch";
		Distance answer=Distance.add(distance, distance1);
		assertEquals(result,answer.getFeet()+"feet"+answer.getInches()+"inch");
	}

}
