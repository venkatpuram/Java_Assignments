import java.util.Scanner;
class Calculator
{
	static double addition(double numberone,double numbertwo)
	{
		double result;
		result=numberone+numbertwo;
		return result;	
	}
	static double substract(double numberone,double numbertwo)
	{
		double result;
		result=numberone-numbertwo;
		return result;
	}
	static double multiply(double numberone,double numbertwo)
	{
		double result;
		result=numberone*numbertwo;
		return result;
	}
	static double division(double numberone,double numbertwo)
	{
		double result;
		result=numberone/numbertwo;
		return result;	
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		double numberone=scan.nextDouble();
		System.out.println("enter second number:");
		double numbertwo=scan.nextDouble();
		System.out.println("addition is:" +addition(numberone,numbertwo));
		System.out.println("substraction is" +substract(numberone,numbertwo));
		System.out.println("multiplication is"+multiply(numberone,numbertwo));
		System.out.println("division is:"+division(numberone,numbertwo));		
		
	}
}