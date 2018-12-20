import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {

	private Country country1,country2,country3;
	Country country[];
	@Before
	public void setUp()
	{
		country1=new Country("india",100000,1000.00);
		country2=new Country("england",50000,750.00);
		country3=new Country("america",75000,1500.50);
		country = new Country[3];
		country[0] = country1;
		country[1] = country2;
		country[2] = country3;
	}
	@Test
	public void largestareatest() {
		Country result = country1.largestcountrybyarea(country);
		assertEquals(country3,result);
	}
	@Test
	public void largestPopulationtest() {
		Country result = country1.largestcountrybypopulation(country);
		assertEquals(country1,result);
	}
	
	@Test
	public void largestdensitytest() {
		Country result = country1.largestcountrybydensity(country);
		assertEquals(country1,result);
	}

}
