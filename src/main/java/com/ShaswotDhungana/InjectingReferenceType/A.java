package com.ShaswotDhungana.InjectingReferenceType;

public class A {

	private int x;
	private B bObj;
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getBObj() {
		return bObj;
	}
	public void setBObj(B obj) {
		this.bObj = obj;
	}
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", bObj=" + bObj + "]";
	}
	
	
	
}
