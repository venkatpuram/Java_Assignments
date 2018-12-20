import java.time.LocalDate;
import java.time.Period;


public class Person {

	private String name;
	private Date dateofbirth;
	private int day;
	private int month;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public Person(String name, int day, int month, int year) {
		this.name=name;
		this.day=day;
		this.month=month;
		this.year=year;
		
	}

	public Person()
	{
		
	}
	
	public String display() {
		LocalDate persondob=LocalDate.of(1987,6,5);
		LocalDate localdate=LocalDate.now();
		Period p=Period.between(persondob, localdate);
		String personname=getName();
		String DateofBirth= day+"/"+month+"/"+year;
		String Age=p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days";
		return Age;
	}
	
	public String olderOne(Person person1,Person person2)
	{
		LocalDate person1dob=LocalDate.of(person1.year, person1.month, person1.day);
		LocalDate person2dob=LocalDate.of(person2.year, person2.month, person2.day);
		Period p=Period.between(person1dob, person2dob);
		if(p.getDays()>0 && p.getMonths()>0 && p.getYears()>0){
			return person1.name+" is older than " +person2.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
		else{
			return person2.name+" is older than " +person1.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
	}

	

}
