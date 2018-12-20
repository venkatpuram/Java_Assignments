
public class Vehicle {
	private int currentspeed;
	private float currentdirection;
	private String ownername;
	static int vehicleid;
	private static int vehiclehighestnumber=9999;
	private int vehiclenumber;
	private String directionarray[]={"north","northeast","east","southeast","south","southwest","west","northwest"};
	private String direction="";
	private final boolean turnright=true;
	private final boolean turnleft=false;
	
	public int getCurrentspeed() {
		return currentspeed;
	}
	public void setCurrentspeed(int currentspeed) {
		this.currentspeed = currentspeed;
	}
	public float getCurrentdirection() {
		return currentdirection;
	}
	public void setCurrentdirection(float currentdirection) {
		this.currentdirection = currentdirection;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(int vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public Vehicle(String ownername){
		this.ownername=ownername;
	}
	
	public Vehicle(){
		
	}
	
	public String OwnerName()
	{
		return ownername;
	}
	
	public int CurrentSpeed()
	{
		return currentspeed;
	}
	
	public float CurrentDirection()
	{
		return currentdirection;
	}
	
	public int ChangeSpeed(int speed)
	{
		if(speed>0 && speed<150)
		currentspeed=speed;
		return currentspeed;
	}
	
	public int Stop()
	{
		int speed=0;
		return speed;
	}
	
	@Override
	public String toString() {
		return "Vehicle [currentspeed=" + currentspeed + ", currentdirection="
				+ currentdirection + ", ownername=" + ownername
				+ ", vehiclenumber=" + vehiclenumber + "]";
	}
	
	public String DirectionDegrees(boolean trueorfalse,float degrees)
	{
		if(trueorfalse)
		{
			if((currentdirection+degrees)<=360)
			{
				currentdirection=currentdirection+degrees;
				if(currentdirection==0 || currentdirection==360)
					direction=directionarray[0];
				if(currentdirection>0 && currentdirection<90)
					direction=directionarray[1];
				if(currentdirection==90)
					direction=directionarray[2];
				if(currentdirection>90 && currentdirection<180)
					direction=directionarray[3];
				if(currentdirection==180)
					direction=directionarray[4];
				if(currentdirection>180 && currentdirection<270)
					direction=directionarray[5];
				if(currentdirection==270)
					direction=directionarray[6];
				if(currentdirection>270 && currentdirection<360)
					direction=directionarray[7];
					
			}
			
		}
		else
		{
			if((currentdirection-degrees)>=-360)
			{
				currentdirection=currentdirection-degrees;
				if(currentdirection==0 || currentdirection==-360)
					direction=directionarray[0];
				if(currentdirection<0 && currentdirection>-90)
					direction=directionarray[7];
				if(currentdirection==-90)
					direction=directionarray[6];
				if(currentdirection<-90 && currentdirection>-180)
					direction=directionarray[5];
				if(currentdirection==-180)
					direction=directionarray[4];
				if(currentdirection<-180 && currentdirection>-270)
					direction=directionarray[3];
				if(currentdirection==-270)
					direction=directionarray[2];
				if(currentdirection<-270 && currentdirection>-360)
					direction=directionarray[1];
			}
		}
		return direction;

	}
	
	public static int highestVehicleNumber()
	{
		return vehiclehighestnumber;
	}
}
