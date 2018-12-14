import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleTest {

	private Rectangle rectangle;
	@Before
	public void setUp()
	{
		rectangle=new Rectangle();
		rectangle.setLength(10);
		rectangle.setBreadth(8);
	}
	@Test
	public void Areatest() {
		assertEquals(80,rectangle.rectangleArea(),0);
		
	}
	
	@Test
	public void Perimetertest() {
		assertEquals(36,rectangle.rectanglePerimeter(),0);
		
	}

}
