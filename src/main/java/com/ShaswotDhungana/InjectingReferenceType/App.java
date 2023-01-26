package com.ShaswotDhungana.InjectingReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/InjectingReferenceType/config.xml");
		
		A aObj = (A)appContext.getBean("ARef");
		
		System.out.println(aObj);
		System.out.println(aObj.getX());
		System.out.println(aObj.getBObj().getY());
		
		
	}
	
}
