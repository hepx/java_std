package com.java.std.AOP.customAOP;

import com.java.std.AOP.common.Level;
import com.java.std.AOP.common.Logger;

/**
 * 现在我们要为这个业务方法加上日志记录的业务,我们在不改变原代码的情况下,
 * 我们会去怎么做呢?也许,你会去写一个类去实现IHello接口,并依赖Hello这个类.
 * @author xixi
 * @date 2013-3-1
 *
 */
public class HelloProxy implements IHello {

	private IHello hello;
	
	public HelloProxy(){}
	
	public HelloProxy(IHello hello){
		this.hello=hello;
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		//方法执行前记录日志
		Logger.log(Level.INF, "方法执行前日志。");
		hello.sayHello(name);
		Logger.log(Level.DEBUG, "方法执行后日志。");
		
	}
}
