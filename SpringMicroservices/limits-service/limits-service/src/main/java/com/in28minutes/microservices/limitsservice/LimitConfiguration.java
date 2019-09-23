package com.in28minutes.microservices.limitsservice;

public class LimitConfiguration {
	private int max;
	private int min;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public LimitConfiguration(int min, int max) {
		super();
		this.max = max;
		this.min = min;
	}
	@Override
	public String toString() {
		return "LimitConfiguration [max=" + max + ", min=" + min + "]";
	}
	
	
	
	

}
