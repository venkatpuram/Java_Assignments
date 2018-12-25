package com.basicCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SetLaptopTest {

	private Laptop laptop1,laptop2,laptop3,laptop4;
	@Before
	public void setUp()
	{
		laptop1=new Laptop("dell","inspiron","windows 10","i5");
		laptop2=new Laptop("lenovo","notepad","windows 10","i5");
		laptop3=new Laptop("hp","intel","windows 10","i5");
		laptop4=new Laptop("lenovo","notepad","windows 8","i7");
	}
	@Test
	public void toReadSettest() {
		HashSet<Object> set=new HashSet<Object>();  
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		list.add(laptop4);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

	

}
