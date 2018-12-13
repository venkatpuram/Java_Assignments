package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiDimentionalArrayTest {

	private MultiDimentionalArray multidimentional;
	@Before
	public void setUp()
	{
		multidimentional = new MultiDimentionalArray();
	}
	
	@Test
	public void findingNumberTest() 
	{
		int array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		assertEquals(true,multidimentional.findingNumber(5,array));
	}

	@Test
	public void findingNumberTest2() 
	{
		int array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		assertEquals(false,multidimentional.findingNumber(10,array));
	}
}
