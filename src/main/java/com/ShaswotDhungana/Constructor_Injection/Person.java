package com.ShaswotDhungana.Constructor_Injection;

public class Person {

	private String name;
	private int id;
	private Certificate certi;
	
	
	public Person(String name, int id, Certificate certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}


	@Override
	public String toString() {
		return "Name : "+this.name+", ID : "+this.id+", Certificate : "+this.certi;
	}
	
	
	
	
	
	
}
