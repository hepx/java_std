package com.java.std.factoryPattern.factory.abstracts;

import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

public class ComputerEnginer {

	public static void makeComputer(AbstractFactory af){
		Cpu cpu=af.crateCpu();
		MainBoard mainBoard=af.createMainBoard();
		cpu.calculate();
		mainBoard.installCpu();
	}
	
	public static void main(String orgs[]){
		//组装INTEL电脑
		//IntelFactory intelFactory=new IntelFactory();
		//makeComputer(intelFactory);
		
		//组装AMD电脑
		AmdFactory amdFactory=new AmdFactory();
		makeComputer(amdFactory);
	}
}
