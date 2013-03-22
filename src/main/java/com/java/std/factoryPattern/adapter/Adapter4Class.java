package com.java.std.factoryPattern.adapter;

/**
 * 类适配器模式--适配器
 * 继承Adaptee并实现接口Target.这样，Adaptee只要关心sampleOperation1的实现，sampleOperation2由Apapter处理。
 * @author xixi
 * @date 2013-3-18
 *
 */
public class Adapter4Class extends Adaptee implements Target {

	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("sampleOperation2");
	}

}
