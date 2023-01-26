package com.ShaswotDhungana.SpringBean_LifeCycle_Implementation_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class MyClass implements InitializingBean , DisposableBean {

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
	

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("LifeCycle of SpringBean Initialized.[Inside Init Method]");
		
	}

	@Override
	public void destroy() throws Exception {
	
		System.out.println("LifeCycle of SpringBean Destroyed.[Inside Destroy Method]");
		
	}
	
	
}
