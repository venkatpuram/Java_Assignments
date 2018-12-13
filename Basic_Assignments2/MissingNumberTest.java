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
		int array[] = {9,7,8,1,5,2,3,6,0};
		assertEquals(4,missingnumber.getMissingNumber(array));
	}

}
