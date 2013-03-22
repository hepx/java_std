package com.java.std;

import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String orgs[]){

        try {
			String v=new String("中国".getBytes(),"GBK");
			System.out.println(new String(v.getBytes("GBK"),"UTF-8"));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
