package com.basicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SetSchoolTest {

	private School school1,school2,school3;
	@Before
	public void setUp()
	{
		school1=new School("chaitanya","tenali","guntur","10");
		school2=new School("narayana","guntur","guntur","10");
		school3=new School("chaitanya","tenali","guntur","9.8");
	}
	@Test
	public void toReadSettest() {
		HashSet<Object> set=new HashSet<Object>();  
		set.add(school1);
		set.add(school2);
		set.add(school3);
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}
