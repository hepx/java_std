package com.java.std.factoryPattern.composite.transparent;

import java.util.List;

/**
 * 合成模式---透明式（抽像类）
 * @author xixi
 * @date 2013-3-18
 *
 */
public abstract class Compontent {

	public void addChild(Compontent c){
		
	}
	
	public void removeChild(int index){
		
	}
	
	public List<Compontent> getChild(){
		return null;
	}
	
	public abstract void printStruct(String preStr);
}
