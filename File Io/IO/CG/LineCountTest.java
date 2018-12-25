package IO.CG;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class LineCountTest {

	 
	@Test
	public void test() throws IOException {
		LineCount linecount=new LineCount();
		assertEquals(28,linecount.countLines());
	}

}
