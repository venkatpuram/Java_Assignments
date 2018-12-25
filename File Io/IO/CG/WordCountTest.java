package IO.CG;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void wordCounttest() throws IOException {
		WordCount wordcount=new WordCount(); 
		assertEquals(295,wordcount.wordcount());
	}

}
