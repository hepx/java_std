package com.java.std.factoryPattern.singleton;

/**
 * 单例模式--懒汉改进版（双重检查加锁）
 * 
 * 但这个方法也还是不能完美的解决单例即延时加载、线程安全且高效的问题。怎么解决？ 看LazySingleton_improve2
 * @author xixi
 * @date 2013-3-16
 *
 */
public class LazySingleton_improve {

	/**
	 * “双重检查加锁”机制的实现会使用关键字volatile，它的意思是：被volatile修饰的变量的值，
	 * 将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
	 * 注：volatile只适应JDK1.5以上包含1.5，且volatile的性能不高效，不见意使用。
	 */
	private volatile static LazySingleton_improve instance=null;
	
	private LazySingleton_improve(){}
	
	/**
	 * 在取当前instance时先不进行同步操作，而是在判断当前instance不在的情况下,增加同步块来保证instance的创建。
	 * 这样有效避免每次都进行同步操作。
	 * @return
	 */
	public static LazySingleton_improve getInstance(){
		if(instance==null){
			synchronized(LazySingleton_improve.class){
				if(instance==null){
					instance=new LazySingleton_improve();
				}
			}
		}
		return instance;
	}
}
