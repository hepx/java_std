package com.java.std.AOP.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.java.std.AOP.common.Level;
import com.java.std.AOP.common.Logger;

public class DynaProxyHello implements InvocationHandler {

	private Object proxyLog;
	private Object delegate;

	public Object bind(Object delegate,Object proxyLog) {
		this.delegate = delegate;
		this.proxyLog=proxyLog;
		return Proxy.newProxyInstance(
				this.delegate.getClass().getClassLoader(), this.delegate
						.getClass().getInterfaces(), this);
	}
	

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result=null;
//		Logger.log(Level.INF, "调用方法前。");
//		result=method.invoke(delegate, args);
//		Logger.log(Level.DEBUG, "调用方法后。");
		
		//方法执行前
		Method start=this.proxyLog.getClass().getDeclaredMethod("start", Method.class);
		start.invoke(this.proxyLog, method);
		
		result=method.invoke(this.delegate, args);
		
		//方法执行后
		Method end=this.proxyLog.getClass().getDeclaredMethod("end", Method.class);
		end.invoke(this.proxyLog, method);
		return result;
	}

}
