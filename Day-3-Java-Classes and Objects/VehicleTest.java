import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VehicleTest {

	private Vehicle vehicle;
	@Before
	public void setUp()
	{
		vehicle =new Vehicle("harish");
		vehicle.setCurrentspeed(40);
		vehicle.setCurrentdirection(0);
		vehicle.setVehiclenumber(2556);
	}
	@Test
	public void OwnerNametest() {
		assertEquals("harish",vehicle.OwnerName());
	}
	
	@Test
	public void Changespeedtest() {
		assertEquals(50,vehicle.ChangeSpeed(50));
	}
	
	@Test
	public void Stoptest() {
		assertEquals(0,vehicle.Stop());
	}
	
	

	@Test
	public void ChangeDirectionTest()
	{
		assertEquals("southwest",vehicle.DirectionDegrees(false, 135));
	}
	
	@Test
	public void highestIdentificationNumberTest()
	{
		assertEquals(9999,vehicle.highestVehicleNumber());
	}
	
	@Test
	public void StringTest()
	{
		assertEquals("Vehicle [currentspeed=40, currentdirection=0.0, ownername=harish, vehiclenumber=2556]",vehicle.toString());
	}
}
