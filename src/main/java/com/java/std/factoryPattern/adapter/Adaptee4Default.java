package com.java.std.factoryPattern.adapter;

/**
 * 缺省适配模式--缺省被适配类实现
 * @author xixi
 * @date 2013-3-18
 *
 */
public class Adaptee4Default extends Adapter4Default {

	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("Adaptee4Default");
	}

	@Override
	public String sampleOperation3() {
		// TODO Auto-generated method stub
		return "Adaptee4Default";
	}

	
}
