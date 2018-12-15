import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexTest {
	private Complex complex;
	private Complex complex1;
	@Before
	public void setUp()
	{
		complex=new Complex(3.5,4.2);
		complex1=new Complex(2.7,3.3);
		
	}

	@Test
	public void testComplex() {
		String result="6.2+7.5i";
		Complex answer=Complex.sum(complex, complex1);
		assertEquals(result,answer.getReal()+"+"+answer.getImaginary()+"i");
		
	}

	

}
