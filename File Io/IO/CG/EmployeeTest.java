package IO.CG;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee;
	@Before
	public void setUp() throws FileNotFoundException
	{
		employee=new Employee(101,"venkat",20000);
	}
	@Test
	public void writeFileTest() throws IOException {
		String result=employee.toString();
		FileWriter file=new FileWriter("C://Users/venpuram/Downloads/assignments.txt");
		file.write(result);
		file.close();
	}

}
