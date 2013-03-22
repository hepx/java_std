package com.java.std.factoryPattern.factory.common.mainboard;

public class IntelMainBoard implements MainBoard {

	private int holes=0;
	public IntelMainBoard(int holes){
		this.holes=holes;
	}
	public void installCpu() {
		// TODO Auto-generated method stub
		System.out.println("Intel主板的插孔数："+holes);
	}

}
