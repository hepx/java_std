package com.java.std.AOP.common;

import java.util.Date;

/**
 * 日志记录
 * @author xixi
 * @date 2013-3-1
 *
 */
public class Logger {

	public static void log(Level l,String content){
		if(l.equals(Level.INF)){
			System.out.println("INFO:"+new Date()+content);
		}else if(l.equals(Level.DEBUG)){
			System.out.println("DEBUG:"+new Date()+content);
		}
	}
}
