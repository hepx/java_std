package com.java.std.factoryPattern.factory.simple;

import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

/**
 * 电脑组装员
 * @author xixi
 * @date 2013-3-4
 *
 */
public class ComputerEnginer {

	public void makeComputer(int cpuType,int mainBoardType){
		//从CPU工厂中创建一个CPU
		Cpu cpu=CpuFactory.createCpu(cpuType);
		//从主板工厂中创建一个MAINBOARD
		MainBoard mainBoard=MainBoardFactory.createMainBoard(mainBoardType);
		
		//测试
		cpu.calculate();
		mainBoard.installCpu();
	}
	
	public static void main(String[]orgs){
		ComputerEnginer cm=new ComputerEnginer();
		//组装一台INTEL平台的电脑
		//cm.makeComputer(1, 1);
		//组装一台AMD平台的电脑
		cm.makeComputer(2, 2);
	}
}
