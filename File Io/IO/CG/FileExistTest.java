package IO.CG;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FileExistTest {

	
	@Test
	public void fileExistTest() {
		FileExist file=new FileExist();
		assertEquals(true,file.File());
	}

}
