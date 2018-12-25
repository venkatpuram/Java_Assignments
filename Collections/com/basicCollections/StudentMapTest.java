package com.basicCollections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class StudentMapTest {

	private StudentFruit student1;
	@Before
	public void setUp()
	{
		student1 = new StudentFruit(); 
		
	}
	@Test
	public void studentMapTest() {
		HashMap<String,String> hm=new HashMap<String,String>(); 
		hm.put("nikil", "apple");
		hm.put("harish", "dryfruit");
		hm.put("pavan", "banana");
		hm.put("venkat", "berry");
		for(Map.Entry m:hm.entrySet())
		{    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}  
		for(Map.Entry m:hm.entrySet())
		{    
		       System.out.println(m.getKey());    
		}  
		System.out.println(hm.get("nikil"));
		System.out.println(hm.get("venkat"));
		System.out.println(hm.get("pavan"));
		System.out.println(hm.get("harish"));
		
	}

}
