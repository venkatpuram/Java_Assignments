package IO.CG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public int wordcount() throws IOException
	{
		int count=0;
		
		BufferedReader bf= new BufferedReader(new FileReader("C://Users/venpuram/Downloads/assignments_io.txt"));
		String line=bf.readLine();
		
		while(line!=null)
		{	 
			String[] words = line.split(" ");
        	for(String w:words)
        	{
        		count++;
        	}
			line=bf.readLine();
		}
		return count;
	}
}
