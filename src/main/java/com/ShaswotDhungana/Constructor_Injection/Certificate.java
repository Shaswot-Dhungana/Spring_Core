package com.ShaswotDhungana.Constructor_Injection;

public class Certificate {

	private String certiName;

	
	
	
	public Certificate(String certiName) {
		super();
		this.certiName = certiName;
	}




	@Override
	public String toString() {
		return certiName;
	}
	
	
	
}
