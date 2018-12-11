import java.util.*;
import java.util.Scanner;
class CuiApplication
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String userid="venkat";
		String password="venkat15";
		int counter = 0;
		for(int count=0;count<3;count++)
		{
			System.out.println("Enter the userid : ");
			String userid1=sc.next();
			System.out.println("Enter the password : ");
			String password1=sc.next();
			if(userid.equals(userid1) && password.equals(password1))
			{
				System.out.println("Welcome " +  userid);
				break;
			}
			else
			{
				counter++;
			}	
		}

		if(counter==3)

		{

			System.out.println("Contact admin");

		}

	}

}