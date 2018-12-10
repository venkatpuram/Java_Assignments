import java.util.Scanner;
public class Table {
	void square(int num)
	{
		int i,num1;
		for(i=1;i<=10;i++)
		{
			num1=num*i;
			System.out.println(""+num+"*"+i+"="+num1+"-------" +num1*num1);
					
		}
	}
	public static void main(String args[])
	{
		Table tab=new Table();
		tab.square(5);
	}

}
