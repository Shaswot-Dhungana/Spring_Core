package com.ShaswotDhungana.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ShaswotDhungana/SetterInjection/config.xml");
    	
    	
        Student student1 = (Student) appContext.getBean("Student1");
        
        System.out.println("Getting Data from object made by Spring..");
        
        System.out.println("ID :~ "+student1.getStudentId());
        System.out.println("Name :~ "+student1.getStudentName());
        System.out.println("Address :~ "+student1.getStudentAddress());
        
        System.out.println(student1); // Showing Object in string because of toString method in Student Class.
        
        
        
        
        
        
        Student student2 = (Student) appContext.getBean("Student2");
        
        System.out.println("Getting Data from object made by Spring..");
        
        System.out.println("ID :~ "+student2.getStudentId());
        System.out.println("Name :~ "+student2.getStudentName());
        System.out.println("Address :~ "+student2.getStudentAddress());
        
        System.out.println(student2); // Showing Object in string because of toString method in Student Class.
        
        
        
        
        
        Student student3 = (Student) appContext.getBean("Student3");
        
        System.out.println("Getting Data from object made by Spring..");
        
        System.out.println("ID :~ "+student3.getStudentId());
        System.out.println("Name :~ "+student3.getStudentName());
        System.out.println("Address :~ "+student3.getStudentAddress());
        
        System.out.println(student3); // Showing Object in string because of toString method in Student Class.
        
        
        
		/*
		 * Student student4 = (Student) appContext.getBean("Student4");
		 * 
		 * System.out.println("Getting Data from object made by Spring..");
		 * 
		 * System.out.println("ID :~ "+student4.getStudentId());
		 * System.out.println("Name :~ "+student4.getStudentName());
		 * System.out.println("Address :~ "+student4.getStudentAddress());
		 * 
		 * System.out.println(student4); // Showing Object in string because of toString
		 * method in Student Class.
		 * 
		 */
        
        
        
        
    }
}
