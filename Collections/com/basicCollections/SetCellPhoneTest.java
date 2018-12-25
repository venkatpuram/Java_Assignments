package com.basicCollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SetCellPhoneTest {

	private CellPhone phone1,phone2,phone3,phone4;
	@Before
	public void setUp()
	{
		phone1=new CellPhone("mi","note4","upgraded version of note3 mobile","android","10000");
		phone2=new CellPhone("mi","note5","upgraded version of note4 mobile","android","14000");
		phone3=new CellPhone("vivo","v9","upgraded version of vivo v7 mobile","android","16000");
		phone4=new CellPhone("mi","note4","upgraded version of note3 mobile","android","12000");
	}
	@Test
	public void toReadSettest() {
		HashSet<Object> set=new HashSet<Object>();  
		set.add(phone1);
		set.add(phone2);
		set.add(phone3);
		set.add(phone4);
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}
	
	@Test
	public void displayTest()
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(phone1);
		list.add(phone2);
		list.add(phone3);
		list.add(phone4);
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}
