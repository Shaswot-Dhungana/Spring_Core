package com.ShaswotDhungana.AutoWiring_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/AutoWiring_Annotations/autoWiringConfig.xml");

		
		Emp obj1 = (Emp) appContext.getBean("emp");
		
		System.out.println(obj1);
		System.out.println(obj1.getAddress().getCity());
		System.out.println(obj1.getAddress().getStreet());
	
		// OR
		
		Emp obj2 = appContext.getBean("emp" , Emp.class);
		
		System.out.println(obj2);
		System.out.println(obj2.getAddress().getCity());
		System.out.println(obj2.getAddress().getStreet());
		
	}
	
}
