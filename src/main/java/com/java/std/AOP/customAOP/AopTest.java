package com.java.std.AOP.customAOP;

/**
 * 最简单的AOP实现
 * 问题：如果我们有很多类似HelloImpt的类，那我们就得写很多类似的proxy
 * @author xixi
 * @date 2013-3-1
 *
 */
public class AopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过代理类来增加日志功能。
		HelloProxy helloProxy=new HelloProxy(new HelloImpt());
		helloProxy.sayHello("world");
		//如果我们不需要日志功能，就可以写成：
//		IHello hello=new HelloImpt();
//		hello.sayHello("world");
	}

}
