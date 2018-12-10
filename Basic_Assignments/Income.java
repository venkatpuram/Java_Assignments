import java.util.Scanner;
public class Income {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the CTC:");
		int ctc=scan.nextInt();
		if(ctc<=180000)
		{
			System.out.println("tax payable is nil");
		}
		else
		if(ctc>180000 && ctc <=300000)
		{
			ctc=(ctc/100)*10;
			System.out.println("Tax is :" +ctc);
		}
		else
		if(ctc>300000 && ctc<=500000)
		{
			ctc=(ctc/100)*20;
			System.out.println("Tax is :" +ctc);
		}
		else
		{
			ctc=(ctc/100)*30;
			System.out.println("Tax is :" +ctc);	
		}

	}

}
