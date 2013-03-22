package com.java.std.factoryPattern.composite.transparent;

public class Leaf extends Compontent{
	
	private String name;
	
	public Leaf(String name){
		this.name=name;
	}

	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"-"+this.name);
	}

}
