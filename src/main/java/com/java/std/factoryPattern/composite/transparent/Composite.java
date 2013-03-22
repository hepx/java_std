package com.java.std.factoryPattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Compontent {
	
	private List<Compontent>coms=new ArrayList<Compontent>();
	
	private String name;
	
	public Composite(String name){
		this.name=name;
	}	

	@Override
	public void addChild(Compontent c) {
		// TODO Auto-generated method stub
		coms.add(c);
	}

	@Override
	public void removeChild(int index) {
		// TODO Auto-generated method stub
		coms.remove(index);
	}

	@Override
	public List<Compontent> getChild() {
		// TODO Auto-generated method stub
		return coms;
	}

	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"-"+this.name);
		if(coms!=null){
			preStr+="  ";
			for(Compontent c:coms){
				c.printStruct(preStr);
			}
		}
	}

}
