
public class Date { 
	private int day, month, year; 
	public Date(int day, int month, int year) 
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
	public boolean isSmaller(Date date)
	{
		Date givendate=new Date(15,8,2018);
		if( date.year<=givendate.year)
		{
			if(date.month<givendate.month)
			{
				if(date.day<givendate.day)
				{
					return true;
				}
			}
		
		}
		return false;
	}
	public int[] diff(Date date) 
	{
		int newdate;
		int newmonth;
		int newyear;
		Date fulldate=new Date(15,8,2018);
		if(fulldate.day>date.day)
		{
			newdate=fulldate.day-date.day;
		}else
		{
			newdate=date.day-fulldate.day;
		}
		if(fulldate.month>date.month)
		{
			newmonth=fulldate.month-date.month;
		}else
		{
			newmonth=date.month-fulldate.month;
		}
		if(fulldate.year>date.year)
		{
			newyear=fulldate.year-date.year;
		}else
		{
			newyear=date.year-fulldate.year;
		}
		int diff[]={newdate,newmonth,newyear};
		return diff;
	}
}