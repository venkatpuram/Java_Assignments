import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter subject1 marks");
		int subject1=scan.nextInt();
		System.out.println("enter subject2 marks");
		int subject2=scan.nextInt();
		System.out.println("enter subject3 marks");
		int subject3=scan.nextInt();
		if(subject1>60 && subject2>60 && subject3>60)
		{
			System.out.println("student is passed");
		}
		else
		if((subject1>60 && subject2>60)||(subject2>60 && subject3>60)||(subject1>60 && subject3>60))
		{
			System.out.println("student is promoted");	
		}
		else
		
		{
			System.out.println("student is failed");
		}
	}

}
