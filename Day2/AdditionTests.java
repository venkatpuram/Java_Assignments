import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Java.Calculator;

public class AdditionTests {
		
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
	public void additiontestpositivevalues() {
		
		assertEquals(20,calculator.addition(10,10),0);
	}
	
	@Test
	public void additiontestNegativevalues() {
		
		assertEquals(-20,calculator.addition(-10,-10),0);
	}
	
	@Test
	public void additiontestOneNegativeValue() {
		
		assertEquals(0,calculator.addition(-10,10),0);
	}
	
	@Test
	public void additiontestOneZero() {
		
		assertEquals(10,calculator.addition(10,0),0);
	}
	
	@Test
	public void additiontestTwoZeros() {
		
		assertEquals(0,calculator.addition(0,0),0);
	}

}
