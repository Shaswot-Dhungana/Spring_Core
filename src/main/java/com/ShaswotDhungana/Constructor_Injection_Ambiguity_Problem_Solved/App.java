package com.ShaswotDhungana.Constructor_Injection_Ambiguity_Problem_Solved;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/Constructor_Injection_Ambiguity_Problem_Solved/config.xml");

		
		MyClass obj = (MyClass)appContext.getBean("myBean");
		
		System.out.println(obj);
				
		
	}
	
	
	
}
