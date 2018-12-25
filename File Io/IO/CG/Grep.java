package IO.CG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grep {

	public String grepCount(String word) throws IOException {
		
		int linenumber=0;
		String lines="";
		String linecount="";
		int count;
		BufferedReader bf= new BufferedReader(new FileReader("C://Users/venpuram/Downloads/assignments_io.txt"));
		while((lines=bf.readLine())!=null)
		{
			linenumber++;
			String[] words = lines.split(" ");
			for(count=0;count<words.length;count++)
			{
				if(words[count].contains(word))
				{
					linecount += linenumber+" "+lines+"\n";
				}
			}
		}
		System.out.println(linecount);
		return linecount;
	}

}
