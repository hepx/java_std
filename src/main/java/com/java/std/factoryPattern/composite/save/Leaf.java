package com.java.std.factoryPattern.composite.save;

/**
 * 叶节点
 * @author xixi
 * @date 2013-3-18
 *
 */
public class Leaf implements Component {
	
	private String name;
	
	public Leaf(String name){
		this.name=name;
	}

	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"-"+this.name);
	}

}
