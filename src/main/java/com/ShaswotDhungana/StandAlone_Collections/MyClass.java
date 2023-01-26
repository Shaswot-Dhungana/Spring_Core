package com.ShaswotDhungana.StandAlone_Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyClass {

	private List<String> studentNames;
	private Set<String> symbolNo;
	private Map<String , String> schoolsAddress;
	private Properties bestTeachers;
	
	
	
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public Set<String> getSymbolNo() {
		return symbolNo;
	}
	public void setSymbolNo(Set<String> symbolNo) {
		this.symbolNo = symbolNo;
	}
	public Map<String, String> getSchoolsAddress() {
		return schoolsAddress;
	}
	public void setSchoolsAddress(Map<String, String> schoolsAddress) {
		this.schoolsAddress = schoolsAddress;
	}
	public Properties getBestTeachers() {
		return bestTeachers;
	}
	public void setBestTeachers(Properties bestTeachers) {
		this.bestTeachers = bestTeachers;
	}
	public MyClass(List<String> studentNames, Set<String> symbolNo, Map<String, String> schoolsAddress,
			Properties bestTeachers) {
		super();
		this.studentNames = studentNames;
		this.symbolNo = symbolNo;
		this.schoolsAddress = schoolsAddress;
		this.bestTeachers = bestTeachers;
	}
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "studentNames=" + studentNames + ", symbolNo=" + symbolNo + ", schoolsAddress=" + schoolsAddress
				+ ", bestTeachers=" + bestTeachers ;
	}
	
	
	
	
	
	
	
}
