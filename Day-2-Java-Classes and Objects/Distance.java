
public class Distance {

	private double feet;
	private double inches;
	
	public Distance(){
		
	}
	
	public Distance(double feet,double inches){
		this.setFeet(feet);
		this.setInches(inches);
	}
	
	public static Distance add(Distance distance,Distance distance1){
		Distance result=new Distance();
		result.setFeet(distance.getFeet()+distance1.getFeet());
		result.setInches(distance.getInches()+distance1.getInches());
		return result;
	}

	public double getInches() {
		return inches;
	}

	public void setInches(double inches) {
		this.inches = inches;
	}

	public double getFeet() {
		return feet;
	}

	public void setFeet(double feet) {
		this.feet = feet;
	}
}
