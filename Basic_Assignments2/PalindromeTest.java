package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	
	private Palindrome palindrome;
	@Before
	public void setUp()
	{
		palindrome=new Palindrome();
	}
	@Test
	public void positiveInteger() {
		assertEquals(true,palindrome.checkPalindrome(121));
		
	}
	
	@Test
	public void NegativeInteger() {
		assertEquals(false,palindrome.checkPalindrome(-121));
		
	}
	
	@Test
	public void TwoDigitInteger() {
		assertEquals(false,palindrome.checkPalindrome(12));
		
	}
	


}
