package Basic_Assignments2;

public class Duplicate {
	
	public String removeDuplicate(String word) {
		String afterRemovingDuplicates =new String();
		int size=word.length();
		for(int index = 0;index<size;index++)
		{
			 if(!afterRemovingDuplicates.contains(String.valueOf(word.charAt(index)))) 
			 {
				 afterRemovingDuplicates+= String.valueOf(word.charAt(index));  
			 }
		}
		return afterRemovingDuplicates;
	}
}
