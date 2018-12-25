package com.basicCollections;

public class Student {

	private String firstname,lastname,id;

	public Student(String firstname, String lastname, String id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname
				+ ", id=" + id + "]";
	}
	
	
}
