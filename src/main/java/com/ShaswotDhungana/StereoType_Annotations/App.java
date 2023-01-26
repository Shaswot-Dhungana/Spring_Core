package com.ShaswotDhungana.StereoType_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/StereoType_Annotations/config.xml");
		
	//	Student obj =  appContext.getBean("student" , Student.class);
		
		Student obj =  appContext.getBean("myObjectVariable1" , Student.class);
	
		System.out.println(obj);
		
		
	}
	
	
}
