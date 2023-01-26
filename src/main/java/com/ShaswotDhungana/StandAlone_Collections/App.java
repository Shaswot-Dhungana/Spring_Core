package com.ShaswotDhungana.StandAlone_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/StandAlone_Collections/config.xml");
		
		MyClass obj = (MyClass) appContext.getBean("myBean");
		
		System.out.println("Students :~ "+obj.getStudentNames());
		System.out.println("Students Symbol Number :~ "+obj.getSymbolNo());
		System.out.println("School and Village :~ "+obj.getSchoolsAddress());
		System.out.println("Best Teachers :~ "+obj.getBestTeachers());
		
		System.out.println(obj.getStudentNames().getClass().getName());
		System.out.println(obj.getSchoolsAddress().getClass().getName());
		System.out.println(obj.getBestTeachers().getClass().getName());
		
	}
	
	
}
