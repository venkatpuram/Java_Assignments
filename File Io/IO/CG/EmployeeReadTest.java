package IO.CG;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReadTest {

	private EmployeeRead employee;
	@Before
	public void setUp()
	{
		employee = new EmployeeRead();
	}
	@Test
	public void ReadFileTest() throws IOException {
		assertEquals("Employee [id=101, name=venkat, salary=20000]",employee.readFile());
	}

}
