package com.java.std.factoryPattern.singleton;

/**
 * 单例模式--饿汉
 * @author xixi
 * @date 2013-3-16
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
