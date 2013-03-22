package com.java.std.factoryPattern.factory.common.cpu;

public class AmdCpu implements Cpu {

	private int pins=0;
	public AmdCpu(int pins){
		this.pins=pins;
	}
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AMD的针脚数："+pins);
	}

}
