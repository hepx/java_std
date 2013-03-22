package com.java.std.factoryPattern.singleton;

/**
 * 单例模式---懒汉
 * @author xixi
 * @date 2013-3-16
 *
 */
public class LazySingleton {

	private static LazySingleton instance=null;
	//私有构造方法
	private LazySingleton(){}
	/**
	 * 公共方法提供唯一实例
	 * 这里加同步快会有性能的问题。因为每次取得当这个instance都会先同步，会多少产生性能的损耗。
	 * @return
	 */
	public static synchronized LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
