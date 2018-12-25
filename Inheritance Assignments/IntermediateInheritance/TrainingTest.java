package IntermediateInheritance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest {

	private Training publictraining,corporatetraining;
	@Before
	public void setUp()
	{
		publictraining = new PublicTraining("java",5000,50);
		corporatetraining=new CorporateTraining("big data",35000,4);
	}
	@Test
	public void publicTrainingtest() {
		assertEquals(250000,publictraining.getOrderValue());
	}
	
	@Test
	public void CorporateTrainingtest() {
		assertEquals(140000,corporatetraining.getOrderValue());
	}

}
