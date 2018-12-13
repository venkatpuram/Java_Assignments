package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DifferentIndicesTest {
	
	private DifferentIndices differentIndices;
	@Before
	public void setUp()
	{
			differentIndices = new DifferentIndices();
	}
	
	@Test
	public void array1() 
	{
		int k=4;
		int array[] ={1,2,3,4,5,2,6,9};
		assertEquals(true,differentIndices.isDistinctValue(array,k));
	}
	
	@Test
	public void array2() 
	{
		int k=4;
		int array[] ={1,2,3,4,5,4,10,9};
		assertEquals(true,differentIndices.isDistinctValue(array,k));
	}
	
	@Test
	public void array3() 
	{
		int k=5;
		int array[] ={1,2,3,4,5,1,10,9};
		assertEquals(true,differentIndices.isDistinctValue(array,k));
	}
}
