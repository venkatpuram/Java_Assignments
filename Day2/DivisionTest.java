import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Java.Calculator;
import Java.InvalidException;


public class DivisionTest {

	
	private Calculator calculator;
	@BeforeClass
	public static void before()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void after()
	{
		System.out.println("After class");
	}
	@Before
	public void setUp()
	{
		System.out.println("Before");
		calculator=new Calculator();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After");
	}
	
	@Test
	public void divisiontestPositiveValues() throws InvalidException {
		assertEquals(5,calculator.division(10,2),0);
	}
	
	@Test
	public void divisiontestOnePositiveValue() throws InvalidException {
		assertEquals(-5,calculator.division(10,-2),0);
	}
	
	@Test
	public void divisiontestNegativeValues() throws InvalidException {
		assertEquals(5,calculator.division(-20,-4),0);
	}
	
	@Test
	public void divisiontestNumeratorZero() throws InvalidException {
		assertEquals(0,calculator.division(0,2),0);
	}
	
	@Test(expected = InvalidException.class)
	public void divisiontestDenominatorZero() throws InvalidException {
		calculator.division(10,0);
	}

}
