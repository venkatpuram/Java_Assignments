package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {
	
	private MissingNumber missingnumber;
	@Before
	public void setUp()
	{
		missingnumber=new MissingNumber();
	}
	@Test
	public void MissingvaluewithoutZero() {
		int array[] = {0,1,3};
		assertEquals(2,missingnumber.getMissingNumber(array));
	}
	@Test
	public void MissingvaluewithZero() {
		int array[] = {9,8,7,6,5,2,3,1,0};
		assertEquals(4,missingnumber.getMissingNumber(array));
	}

}
