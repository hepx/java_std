package com.java.std.paramPass;

/**
 * JAVA参数的传递，其本质是传递一个副本。
 * JAVA参数传递，按值传递
 * @author xixi
 * @date 2013-3-14
 *
 */
public class BaseTypePass {

	public static void main(String []orgs){
		int v=5;
		change1(v);
		//传递的是v的副本，不会对原来的v改变
		System.out.println(v);
		change2(v);
		//传递的是v的副本，不会对原来的v改变
		System.out.println(v);
	}
	
	public static void change1(int v){	
		v++;
		System.out.println(v);
	}
	public static void change2(int v){
		v=8;
		System.out.println(v);
	}
}
