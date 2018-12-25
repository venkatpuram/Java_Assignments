package IO.CG;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCount {
	public int countLines() throws IOException {
	    LineNumberReader reader  = new LineNumberReader(new FileReader("C://Users/venpuram/Downloads/assignments_io.txt"));
	    int count = 0;
	    String lineRead = "";
	    while ((lineRead = reader.readLine()) != null) {}

	    count = reader.getLineNumber(); 
	    reader.close();
	    return count;
	}
}
