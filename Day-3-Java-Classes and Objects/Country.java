
public class Country {

	private String countryname;
	private long population;
	private double area;
	private int count;
	public String getCountryname() {
		return countryname;
	}
	
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public long getPopulation() {
		return (long) population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public Country(String countryname, long population, double area) {
		this.countryname=countryname;
		this.population=population;
		this.area=area;
	}
	
	public Country largestcountrybyarea(Country[] value)
	 {
		Country largestArea = value[0];
		for(count=0;count<value.length;count++)
		{
			if(value[count].area>largestArea.area)
			{
				largestArea = value[count];
			}
		}
		return largestArea;
	 } 
	
	public Country largestcountrybypopulation(Country[] value)
	 {
		Country largestPopulation = value[0];
		for(count=0;count<value.length;count++)
		{
			if(value[count].population>largestPopulation.population)
			{
				largestPopulation = value[count];
			}
		}
		return largestPopulation;
	 } 
	
	public Country largestcountrybydensity(Country[] value)
	 {
		Country largestdensity = value[0];
		for(count=0;count<value.length;count++)
		{
			if(value[count].population/value[count].area>largestdensity.population/largestdensity.area)
			{
				largestdensity = value[count];
			}
		}
		return largestdensity;
	 } 
	
}
