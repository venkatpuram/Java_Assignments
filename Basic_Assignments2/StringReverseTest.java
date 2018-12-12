package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

	private StringReverse stringreverse;
	@Before
	public void setUp()
	{
		stringreverse=new StringReverse();
	}
	
	@Test
	public void stringReverseTest() {
		assertEquals("s'teL ekat edoCteeL tsetnoc",
				stringreverse.reverseWords("Let's take LeetCode contest"));
		
	}

}
