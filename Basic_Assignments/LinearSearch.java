import java.util.*;
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int array[]={10,45,2,78,4,56,12,98,9,25,36,85,42,69,39};
		System.out.println("enter the number to be searched :");
		int number=scan.nextInt();
		for(int count=0;count<array.length;count++)
		{
			if(array[count]==number)
			{
				System.out.println(+number+" is present in the array");
			}
		}
	}
}