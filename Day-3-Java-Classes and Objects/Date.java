
public class Date { 
	private int date, month, year; 
	public Date(int date, int month, int year) 
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return date+"/"+month+"/"+year;
	}
	public boolean isSmaller(Date d)
	{
		Date givendate=new Date(15,8,2018);
		if(d.date<givendate.date)
		{
			return true;
		}else
		return false; 
	}
	public int[] diff(Date d) 
	{
		Date fulldate=new Date(15,8,2018);
		int newdate=fulldate.date-d.date;
		int newmonth=fulldate.month-d.month;
		int newyear=fulldate.year-d.year;
		int diff[]={newdate,newmonth,newyear};
		return diff;
	}
}