package com.ShaswotDhungana.SetterInjection;



public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting studentID Using Spring{Injecting Dependency} ");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting studentName Using Spring{Injecting Dependency} ");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting studentAddress Using Spring{Injecting Dependency} ");
		this.studentAddress = studentAddress;
	}
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// toString Method for converting hashValue/hashCode to string
    @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	
	
}
