package IO.CG;

import java.io.File;

public class FileExist {
	public boolean File()
	{
		File f = new File("C://Users/venpuram/Downloads/assignments_io.txt");
		if(f.exists()){
			return true;
		}
		else{
			return false;
		}
	}
}
