
public class Triangle {

	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public boolean isRight(){
		double a=Math.pow(side1, 2);
		double b=Math.pow(side2, 2);
		double c=Math.pow(side3, 2);
		if((a+b)==c)
			return true ;
		return false;
			
	}
	
	public boolean isScalene()
	{
		if(side1!=side2 && side1!=side3 && side2!=side3)
			return true;
		return false;
	}
	
	public boolean isIsosceles()
	{
		if((side1==side2 && side2!=side3) || (side1==side3 && side3!=side2) || (side2==side3 && side3!=side1))
			return true;
		return false;
	}
	
	public boolean isEquilateral()
	{
		if(side1==side2 && side1==side3 && side2==side3)
			return true;
		return false;
	}
}
