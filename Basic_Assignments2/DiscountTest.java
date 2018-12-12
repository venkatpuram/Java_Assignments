package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiscountTest {

	private Discount discount;
	@Before
	public void setUp()
	{
		discount=new Discount();
	}
	@Test
	public void DiscountTestItem() {
		assertEquals(1950,discount.itemDiscount(3000));
		
	}
	@Test
	public void DiscountTestItemforNegative() {
		assertEquals(0,discount.itemDiscount(-3000));
		
	}

}
