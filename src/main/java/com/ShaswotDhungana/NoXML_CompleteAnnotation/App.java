package com.ShaswotDhungana.NoXML_CompleteAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
		
	//	Student obj = appContext.getBean("student" , Student.class);
		Student obj = appContext.getBean("getStudent" , Student.class);
		
		System.out.println(obj.hashCode());
		
		obj.study();
		
		
	}
	
}
