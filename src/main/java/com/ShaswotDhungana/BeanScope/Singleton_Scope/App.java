package com.ShaswotDhungana.BeanScope.Singleton_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/BeanScope/Singleton_Scope/config.xml");
		
	//	Student obj =  appContext.getBean("student" , Student.class);
		
		Student obj1 =  appContext.getBean("myObjectVariable1" , Student.class);
	
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
		
		
		Student obj2 =  appContext.getBean("myObjectVariable1" , Student.class);
		
		System.out.println(obj2);
		System.out.println(obj2.hashCode());
		
		// Bean scope is Singleton ByDefault.
		System.out.println("HashCode of Object is same , that means in SingleTon BeanScope springIOC Container provide us same object");
		
	}
	
	
}
