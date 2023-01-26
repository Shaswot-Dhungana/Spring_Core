package com.ShaswotDhungana.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/Constructor_Injection/config.xml");
		
		
		Person obj = (Person)appContext.getBean("personBean");
		

		System.out.print(obj);
		
		
		
		
		
	}
	
	
}
