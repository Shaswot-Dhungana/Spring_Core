package com.ShaswotDhungana.Constructor_Injection_Ambiguity_Problem_Solved;

public class MyClass {

	private int x;
	private int y;
	
	
	// if we don't define Data Type and Index of Values in bean then this will happen :~  
	// First constructor (first by order) will be called by Spring.
	// if There is String - String type constructor then that constructor will be called because spring hold data/values in String by  default in Bean.
	// and if we define dataType of Values in bean then it will call respective constructor of class.
	
	
	
	public MyClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("[Injecting] Both Are Integers");
	}
	
	
	public MyClass(double x, double y) {
		super();
		this.x = (int)x;
		this.y = (int)y;
		System.out.println("[Injecting] Both Are Doubles");
	}


	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	
	
	
	
}
