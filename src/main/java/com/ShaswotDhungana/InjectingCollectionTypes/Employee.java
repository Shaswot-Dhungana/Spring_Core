package com.ShaswotDhungana.InjectingCollectionTypes;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> empNumbers;
	private Set<String> empAddresses;
	private Map<String , String> empBackground;
	private Properties empGirlFriends;
	
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpNumbers() {
		return empNumbers;
	}
	public void setEmpNumbers(List<String> empNumbers) {
		this.empNumbers = empNumbers;
	}
	public Set<String> getEmpAddresses() {
		return empAddresses;
	}
	public void setEmpAddresses(Set<String> empAddresses) {
		this.empAddresses = empAddresses;
	}
	public Map<String, String> getEmpBackground() {
		return empBackground;
	}
	public void setEmpBackground(Map<String, String> empBackground) {
		this.empBackground = empBackground;
	}
	
	public Properties getEmpGirlFriends() {
		return empGirlFriends;
	}
	public void setEmpGirlFriends(Properties empGirlFriends) {
		this.empGirlFriends = empGirlFriends;
	}
	
	
	
	public Employee(String empName, List<String> empNumbers, Set<String> empAddresses,
			Map<String, String> empBackground, Properties empGirlFriends) {
		super();
		this.empName = empName;
		this.empNumbers = empNumbers;
		this.empAddresses = empAddresses;
		this.empBackground = empBackground;
		this.empGirlFriends = empGirlFriends;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}
