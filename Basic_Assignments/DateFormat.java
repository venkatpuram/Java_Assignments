package Java;

import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter date:");
		int date=scan.nextInt();
		System.out.println("enter month:");
		int month=scan.nextInt();
		System.out.println("enter year");
		int year=scan.nextInt();
		
		if(month==1 && date<31)
		{
			System.out.println(date+"/"+"january"+"/"+year);
		}else
		if(month==2 && date<29)
		{
			System.out.println(date+"/"+"february"+"/"+year);
		}else
		if(month==3 && date<31)
		{
			System.out.println(date+"/"+"march"+"/"+year);
		}else
		if(month==4 && date<30)
		{
			System.out.println(date+"/"+"april"+"/"+year);
		}else
		if(month==5 && date<31)
		{
			System.out.println(date+"/"+"may"+"/"+year);
		}else
		if(month==6 && date<30)
		{
			System.out.println(date+"/"+"june"+"/"+year);
		}else
		if(month==7 && date<31)
		{
			System.out.println(date+"/"+"july"+"/"+year);
		}else
		if(month==8 && date<31)
		{
			System.out.println(date+"/"+"august"+"/"+year);
		}else
		if(month==9 && date<30)
		{
			System.out.println(date+"/"+"september"+"/"+year);
		}else
		if(month==10 && date<31)
		{
			System.out.println(date+"/"+"october"+"/"+year);
		}else
		if(month==11 && date<30)
		{
			System.out.println(date+"/"+"november"+"/"+year);
		}else
		if(month==12 && date<30)
		{
			System.out.println(date+"/"+"december"+"/"+year);
		}
		

	}

}
