package com.java.std.IOC;

import java.lang.reflect.Method;

/**
 * 自定交IOC实现
 * @author xixi
 * @date 2013-2-28
 *
 */
public class CustomIOC {

	public static void GetInstance(String className) throws Exception{
		Object obj=Class.forName(className).newInstance();
		Method methods[]=obj.getClass().getMethods();
		for(Method m:methods){
//			System.out.println(m.getName());
			if(m.getName().equals("forward")){
				m.invoke(obj, 50);
			}
		}
	}
	
	public static void main(String orgs[]){
		try {
			GetInstance("com.java.std.IOC.Car");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
