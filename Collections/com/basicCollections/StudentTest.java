package com.basicCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private Student student1,student2,student3;
	@Before
	public void setUp()
	{
		student1=new Student("Venkat","puram","101");
		student2=new Student("Pavan","kaleru","102");
		student3=new Student("Harish","javvaji","104");
	}
	@Test
	public void naturalOrderTest() {
		TreeSet<Object> set=new TreeSet<Object>();  
		set.add(student1.toString());
		set.add(student2.toString());
		set.add(student3.toString());
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}
}
