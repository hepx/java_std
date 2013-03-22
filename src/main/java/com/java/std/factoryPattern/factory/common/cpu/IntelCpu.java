package com.java.std.factoryPattern.factory.common.cpu;

public class IntelCpu implements Cpu {

	private int pins=0;
	
	public IntelCpu(int pins){
		this.pins=pins;
	}
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("INTEL的针脚数："+pins);
	}

}
