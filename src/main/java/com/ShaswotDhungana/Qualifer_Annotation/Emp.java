package com.ShaswotDhungana.Qualifer_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	// we can autowire in up of setter method , constructor and in up of Property {reference-Type}.
	// @Qualifier annotation is used to link bean with property,setterMethod or Constructor using same name.
	
	
	@Autowired
	@Qualifier("myBean")
	private Address address;

	
	
	public Address getAddress() {
		return address;
	}


//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Values.");
		this.address = address;
	}

	
//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}

	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	
	
	
}
