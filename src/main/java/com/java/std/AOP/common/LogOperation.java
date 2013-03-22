package com.java.std.AOP.common;

import java.lang.reflect.Method;

public interface LogOperation {

	public void start(Method method);
	
	public void end(Method method);
}
