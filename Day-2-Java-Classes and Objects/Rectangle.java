
public class Rectangle {
	private float length;
	private float breadth;
	void Rectangle(float length,float breadth)
	{
		this.setLength(length);
		this.setBreadth(breadth);
	}
	public float rectangleArea()
	{
		float area=getLength()*getBreadth();
		return area;
	}
	
	public float rectanglePerimeter()
	{
		float perimeter= 2*(getLength()+getBreadth());
		return perimeter;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

}
