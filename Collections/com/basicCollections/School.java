package com.basicCollections;

public class School {
	
	private String name, city, schooldistrict, greatSchoolRanking;

	public School(String name, String city, String schooldistrict,
			String greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schooldistrict = schooldistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schooldistrict="
				+ schooldistrict + ", greatSchoolRanking=" + greatSchoolRanking
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((schooldistrict == null) ? 0 : schooldistrict.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schooldistrict == null) {
			if (other.schooldistrict != null)
				return false;
		} else if (!schooldistrict.equals(other.schooldistrict))
			return false;
		return true;
	}
	
	
}
