package IO.CG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeRead {

	public String readFile() throws IOException {
		
		BufferedReader bf= new BufferedReader(new FileReader("C://Users/venpuram/Downloads/assignments.txt"));
		String lines="";
		String linecount="";
		while((lines=bf.readLine())!=null)
		{
			linecount=linecount+lines;
		}
		bf.close();
		return linecount;
	}

}
