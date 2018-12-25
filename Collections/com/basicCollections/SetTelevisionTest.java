package com.basicCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SetTelevisionTest {

	private Television television1,television2,television3;
	@Before
	public void setUp()
	{
		television1=new Television("samsung","LED","3D","30000");
		television2=new Television("LG","plasma","3D","35000");
		television3=new Television("samsung","LED","3D","30000");
	}
	@Test
	public void toReadSettest() {
		HashSet<Object> set=new HashSet<Object>();  
		set.add(television1);
		set.add(television2);
		set.add(television3);
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(television1);
		list.add(television2);
		list.add(television3);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}
