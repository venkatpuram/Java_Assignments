import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Java.Calculator;


public class MultiplicationTest {
	
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
	public void multiplytestpositivevalues() {
		assertEquals(10,calculator.multiply(2,5),0);
		
	}
	
	@Test
	public void multiplytestNegativeValues() {
		assertEquals(10,calculator.multiply(-2,-5),0);
		
	}

	@Test
	public void multiplytestOneNegativeValue() {
		assertEquals(-10,calculator.multiply(-2,5),0);
		
	}
	
	@Test
	public void multiplytestOneZerovalue() {
		assertEquals(0,calculator.multiply(0,5),0);
		
	}
}
