import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Java.Calculator;

public class SubstractionTests {

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
	public void substractTestpositivevalues() {
		
		assertEquals(10,calculator.substract(30,20),0);
	}
	
	@Test
	public void substractTestNegativevalues() {
		
		assertEquals(-10,calculator.substract(-30,-20),0);
	}

	@Test
	public void substractTestoneNegativevalue() {
		
		assertEquals(-50,calculator.substract(-30,20),0);
	}
	
	@Test
	public void substractTestOneZero() {
		
		assertEquals(-20,calculator.substract(0,20),0);
	}
	
	@Test
	public void substractTestZerovalues() {
		
		assertEquals(0,calculator.substract(0,0),0);
	}
}
