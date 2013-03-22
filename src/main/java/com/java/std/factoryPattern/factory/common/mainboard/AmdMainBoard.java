package com.java.std.factoryPattern.factory.common.mainboard;

public class AmdMainBoard implements MainBoard {

	private int holes=0;
	public AmdMainBoard(int holes){
		this.holes=holes;
	}
	public void installCpu() {
		// TODO Auto-generated method stub
		System.out.println("AMD主板的插孔数："+holes);
	}

}
