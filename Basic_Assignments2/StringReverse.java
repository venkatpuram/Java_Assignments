package Basic_Assignments2;

public class StringReverse {
	
	public String reverseWords(String str) 
	{
		String words[] = str.split(" ");
	    StringBuilder originalword=new StringBuilder();         //StringBuilder class is also used to create mutable (modifiable) string object.
	    for (String word: words)
	            originalword.append(new StringBuffer(word).reverse().toString() + " ");
	    return originalword.toString().trim();       //The trim()is a built-in function that eliminates leading and trailing spaces
	 }
}
