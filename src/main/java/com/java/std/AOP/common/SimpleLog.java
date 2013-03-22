package com.java.std.AOP.common;

import java.lang.reflect.Method;

public class SimpleLog implements LogOperation {

	public void start(Method method) {
		// TODO Auto-generated method stub
		Logger.log(Level.INF, method.getName()+"开始执行。");
	}

	public void end(Method method) {
		// TODO Auto-generated method stub
		Logger.log(Level.INF, method.getName()+"结束执行。");
	}

}
