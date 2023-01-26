package com.ShaswotDhungana.SPEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("myObjectVariable1")
@Scope("prototype")
public class Student {

		@Value("#{ new java.lang.String('Shaswot Dhungana')}") // creating object using spel
		private String studentName;
		
		@Value("Jakarta")
		private String city;
		
		@Value("#{myAddress}") // this is Spring Expression language(SPEL)
		private List<String> address;
		
		@Value("#{13+2}")  // SPEL
		private int rollNumber;
		

		@Value("#{ T(com.ShaswotDhungana.SPEL.Student).myAge(5 , 5) }") // invoking static method using SPEL
		private int age;
		
		
		@Value("#{ T(com.ShaswotDhungana.SPEL.Student).mySymbolNo }")  // Invoking Static variable using SPEL
		private int symbolNo;
		
		
		
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		
		public List<String> getAddress() {
			return address;
		}
		public void setAddress(List<String> address) {
			this.address = address;
		}
		
		
		
		
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		
		
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public int getSymbolNo() {
			return symbolNo;
		}
		public void setSymbolNo(int symbolNo) {
			this.symbolNo = symbolNo;
		}
		
		
		
		public Student(String studentName, String city, List<String> address, int rollNumber, int age, int symbolNo) {
			super();
			this.studentName = studentName;
			this.city = city;
			this.address = address;
			this.rollNumber = rollNumber;
			this.age = age;
			this.symbolNo = symbolNo;
		}
		
		
		
		
		
		public static int myAge(int x , int y) {
			int sum = x + y;
			return sum;
		}
		
		public static  int mySymbolNo = 000673;
		
		
		
		
	
	
	
}
