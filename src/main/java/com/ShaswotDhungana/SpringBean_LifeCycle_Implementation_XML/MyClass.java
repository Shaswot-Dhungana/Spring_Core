package com.ShaswotDhungana.SpringBean_LifeCycle_Implementation_XML;

public class MyClass {

	private String name;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Property");
		this.name = name;
	}

	
	
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "My Name is " + name;
	}
	
	
	// LifeCycle Methods of SpringBean
	
	public void myInitMethod() {
		
		System.out.println("LifeCycle of SpringBean Initialized.[Inside Init Method]");
		
	}
	
	public void myDestroyMethod() {
		
		System.out.println("LifeCycle of SpringBean Destroyed.[Inside Destroy Method]");
		
	}
	
	
}
