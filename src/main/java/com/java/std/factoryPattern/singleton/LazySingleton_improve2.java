package com.java.std.factoryPattern.singleton;

/**
 * 单例模式--懒汉完美版（完美的解决了线程安全，效率，延迟加载等问题）
 * @author xixi
 * @date 2013-3-16
 *
 */
public class LazySingleton_improve2 {

	/**
	 * 私有构造器
	 */
	private LazySingleton_improve2(){};
	
	/**
	 * 静态内部类。
	 * @author xixi
	 * @date 2013-3-16
	 *
	 */
	private static class SingletonHolder{
		private static LazySingleton_improve2 instance=new LazySingleton_improve2();
	}
	
	/**
	 * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，
	 * 导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域，
	 * 从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，
	 * 并由虚拟机来保证它的线程安全性。
	 * @return
	 */
	public static LazySingleton_improve2 getInstance(){
		return SingletonHolder.instance;
	}
}
