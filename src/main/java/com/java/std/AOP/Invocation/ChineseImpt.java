package com.java.std.AOP.Invocation;

/**
 * 
 * @author xixi
 * @date 2013-3-1
 *
 */
public class ChineseImpt implements IHello {

	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("你好 "+name);
	}

	public void sayGoodBye(String name) {
		// TODO Auto-generated method stub
		System.out.println("再见 "+name);
	}

}
