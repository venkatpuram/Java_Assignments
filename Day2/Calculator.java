package Java;

import java.util.Scanner;
public class Calculator
{
	public double addition(double numberone,double numbertwo)
	{
		
		return numberone+numbertwo;
	}
	public double substract(double numberone,double numbertwo)
	{
		double result;
		result=numberone-numbertwo;
		return result;
	}
	public double multiply(double numberone,double numbertwo)
	{
		double result;
		result=numberone*numbertwo;
		return result;
	}
	public double division(double numberone,double numbertwo) throws InvalidException
	{
		
		double result;
		//if(numbertwo == 0) throw new InvalidException();
		result=numberone/numbertwo;
		return result;
		
	}
	
}