package Basic_Assignments2;
import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class RemoveWord {
	public String word(String sentence,String delete,int position)
    {
        sentence = sentence.toUpperCase();
        delete=delete.toUpperCase();
        int l = sentence.length();
        char last = sentence.charAt(l-1); 
        if(last != '.' && last != '?' && last != '!')
        {
            return "Invalid Input";
        }
        else
        {
            StringTokenizer str = new StringTokenizer(sentence," .?!");
            int c = str.countTokens();
            String w="",ans = "";
            
           
            int x = position;
 
            if(x<1 || x>c) 
            {
                return "the word position is out of range ";
            }
            else
            {      
                for(int i=1; i<=c; i++)
                {
                    w = str.nextToken();
                    
                    if(w.equals(delete)==true && i == x)
                        continue;
                    ans = ans + w + " ";
                }
                return ans.trim()+last;
            }
        }
    }
}
