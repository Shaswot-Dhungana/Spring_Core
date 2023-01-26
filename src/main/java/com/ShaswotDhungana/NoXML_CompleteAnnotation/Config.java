package com.ShaswotDhungana.NoXML_CompleteAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
// @ComponentScan(basePackages = "com.ShaswotDhungana.NoXML_CompleteAnnotation")
public class Config {

	
	// creating new Student object
	@Bean
	public Student getStudent() {
		
		Student student = new Student();
		return student;
		
	}
	
}
