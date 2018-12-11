import java.util.Scanner;
public class Average 
{
	public static void main(String args[])
	{
		int studentDetails[][]=new int[3][3];
		int total=0;
		Scanner scan=new Scanner(System.in);
		for(int row=0;row<3;row++)
		{
			System.out.println("enter student  "+(rows+1)+"  marks in A,B and C subjects:");
			for(int column=0;column<3;column++)
			{
				studentDetails[row][column]=scan.nextInt();
			}
		}
		for(int row=0;row<3;row++)
		{
			total=0;
			for(int column=0;column<3;column++)
			{
				total += studentDetails[row][column];
			}
			System.out.println("total score of student "+(row+1)+" :"+total);
			System.out.println("Average score is:"+(total/3));
		}
	}
}