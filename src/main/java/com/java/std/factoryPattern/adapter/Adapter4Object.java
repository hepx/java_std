package com.java.std.factoryPattern.adapter;

/**
 * 对象适配器模式--在类中定义需要被适配的对象来处理目标上的方法
 * @author xixi
 * @date 2013-3-18
 *
 */
public class Adapter4Object implements Target {

	private Adaptee adaptee;
	
	public Adapter4Object(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	
	public void sampleOperation1() {
		// TODO Auto-generated method stub
		adaptee.sampleOperation1();
	}

	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("sampleOperation2");
	}

}
