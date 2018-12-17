import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	private Triangle triangle;
	private Triangle triangle1;
	private Triangle triangle2;
	private Triangle triangle3;
	@Before
	public void setUp()
	{
		triangle=new Triangle(3,4,5);
		triangle1=new Triangle(3,4,5);
		triangle2=new Triangle(4,4,5);
		triangle3=new Triangle(5,5,5);
		
	}
	@Test
	public void RightAngletest() {
		assertEquals(true, triangle.isRight());
	}

	@Test
	public void Scalenetest() {
		assertEquals(true, triangle1.isScalene());
	}
	
	@Test
	public void Isoscelestest() {
		assertEquals(true, triangle2.isIsosceles());
	}
	
	@Test
	public void Equilateraltest() {
		assertEquals(true, triangle3.isEquilateral());
	}
}
