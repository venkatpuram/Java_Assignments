package com.basicCollections;

public class Car implements Comparable<Car>{

	private String make, model, year, price;

	public Car(String make, String model, String year, String price) {
		super();
		this.setMake(make);
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + getMake() + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getMake() == null) ? 0 : getMake().hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (getMake() == null) {
			if (other.getMake() != null)
				return false;
		} else if (!getMake().equals(other.getMake()))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public int compareTo(Car car) {
		 int last = this.getMake().compareTo(car.getMake());
		 return last;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
}
