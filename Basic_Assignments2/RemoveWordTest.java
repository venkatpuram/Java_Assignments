package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveWordTest {

	private RemoveWord removeword;
	@Before
	public void setUp()
	{
		removeword=new RemoveWord();
	}
	@Test
	public void test1() {
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.",removeword.word("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.","IS",6));
		
	}
	

}
