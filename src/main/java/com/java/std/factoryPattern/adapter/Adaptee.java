package com.java.std.factoryPattern.adapter;

/**
 * 适配模式--被适配类
 * 此类只需要实现 Target的sampleOperation1的方法。为了达到此目的，我们需要一个adapter做适配。
 * @author xixi
 * @date 2013-3-18
 *
 */
public class Adaptee{

	public void sampleOperation1() {
		// TODO Auto-generated method stub
		System.out.println("sampleOperation1");
	}

}
