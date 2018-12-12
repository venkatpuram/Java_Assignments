package Basic_Assignments2;

public class MissingNumber 
{ 
    
    public int getMissingNumber (int array[]) 
    { 
    	
        int actualtotal=0;
        int currenttotal=0; 
        for(int count=0;count<array.length;count++)
        {
        	currenttotal +=array[count];
        }
        actualtotal=(array.length*(array.length+1))/2;
        actualtotal -=currenttotal;
        return actualtotal;
    }         
} 
