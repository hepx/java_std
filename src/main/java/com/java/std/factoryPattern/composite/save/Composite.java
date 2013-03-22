package com.java.std.factoryPattern.composite.save;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component>coms=new ArrayList<Component>();
	
	private String name;
	
	public Composite(String name){
		this.name=name;
	}
	
	public void addChild(Component c){
		coms.add(c);
	}
	
	public void removeChild(int index){
		coms.remove(index);
	}
	
	public List<Component>getComponents(){
		return coms;
	}
	
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"-"+this.name);
		if(coms!=null){
			preStr+="  ";
			for(Component c:coms){
				c.printStruct(preStr);
			}
		}
	}

}
