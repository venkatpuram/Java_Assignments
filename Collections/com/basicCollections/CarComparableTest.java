package com.basicCollections;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class CarComparableTest {

	private Car car1,car2,car3,car4;
	@Before
	public void setUp()
	{
		car1=new Car("toyota","innova","2008","1200000");
		car2=new Car("suzuki","swift","2009","1000000");
		car3=new Car("toyota","innova","2014","2000000");
		car4=new Car("honda","city","2007","1200000");
		
	}
	@Test
	public void comparableTest() {
		ArrayList<Car> al=new ArrayList<Car>();  
		al.add(car1);  
		al.add(car2);  
		al.add(car3); 
		al.add(car4);
		  
		Collections.sort(al);  
		for(Car car:al){  
		System.out.println(car.getMake()+" ");  
		}  
	}

}
