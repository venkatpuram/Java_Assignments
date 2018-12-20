import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	private Person person,person1;
	@Before
	public void setUp()
	{
		person=new Person("Ram", 5, 6, 1980);
		person1=new Person("Shyam", 2, 3, 1987);
		
	}
	@Test
	public void Displaytest() {
		assertEquals("31years 6months 15days",person.display());
	}
	
	@Test
	public void OlderOneTest()
	{
		assertEquals("Ram is older than Shyam by 6 years ,8 months, and 25days",person1.olderOne(person,person1));
	}
	

}
