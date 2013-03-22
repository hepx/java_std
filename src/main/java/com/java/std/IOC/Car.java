package com.java.std.IOC;

public class Car {
	private String name;
	public Car(){}
	public Car(String name){
		this.name=name;
	}
	public void forward(Integer range){
		System.out.println("向前"+range+"米");
	}
	
	public void backward(Integer range){
		System.out.println("向后"+range+"米");
	}
	
	private void checkSys(){
		System.out.println("系统自检");
	}
	
	protected void checkAir(){
		System.out.println("检查空气");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
