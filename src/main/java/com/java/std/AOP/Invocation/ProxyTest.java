package com.java.std.AOP.Invocation;

import com.java.std.AOP.common.SimpleLog;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHello hello=(IHello)new DynaProxyHello().bind(new AmericanImpt(),new SimpleLog());
		hello.sayHello("jeke");
		hello.sayGoodBye("jeke");
	}

}
