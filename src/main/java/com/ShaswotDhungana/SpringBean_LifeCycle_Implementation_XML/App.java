package com.ShaswotDhungana.SpringBean_LifeCycle_Implementation_XML;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/SpringBean_LifeCycle_Implementation_XML/config.xml");
		
		MyClass obj = (MyClass) appContext.getBean("myBean");
		
		System.out.println(obj);
		
		// Registering ShutDown Hook for running destroy method...
		// ApplicationContext doesnot have this method so
		// using AbstractApplicationContext..
		
		appContext.registerShutdownHook();
		
	}
	
	
}
