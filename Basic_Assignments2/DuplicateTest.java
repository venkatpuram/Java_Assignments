package Basic_Assignments2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DuplicateTest 
{
	private Duplicate duplicate;
	@Before
	public void setUp()
	{
	duplicate = new Duplicate();
	}
	@Test
	public void Repeatedletters() 
	{
		String word1 = "abcabcabc";
				assertEquals("abc",duplicate.removeDuplicate(word1));
	}
	@Test
	public void Repeatedletterwords() 
	{
		String word1 = "javaforschool";
		assertEquals("javforschl",duplicate.removeDuplicate(word1));
	}

	@Test
	public void RepeatedletterWord() 
	{
		String word1 = "Mississippi";
		assertEquals("Misp",duplicate.removeDuplicate(word1));
	}

}
