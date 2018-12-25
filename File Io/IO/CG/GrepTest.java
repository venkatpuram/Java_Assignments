package IO.CG;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class GrepTest {

	@Test
	public void test() throws IOException {
		Grep grep=new Grep();
		grep.grepCount("Java");
	}

}
