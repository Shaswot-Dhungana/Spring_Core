package com.ShaswotDhungana.InjectingCollectionTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/InjectingCollectionTypes/config.xml");

		
		Employee emp1 = (Employee)appContext.getBean("Emp");
		
		
		System.out.println("Employee Name :~ "+emp1.getEmpName());
		System.out.println("Employee Addresses :~ "+emp1.getEmpAddresses());
		System.out.println("Employee Numbers :~ "+emp1.getEmpNumbers());
		System.out.println("Employee Backgrounds :~ "+emp1.getEmpBackground());
		System.out.println("Employee GirlFriend's :~ "+emp1.getEmpGirlFriends());
		
		
	}
	
}
