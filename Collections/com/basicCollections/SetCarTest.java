package com.basicCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SetCarTest {

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
	public void toReadSettest() {
		HashSet<Object> set=new HashSet<Object>();  
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}
