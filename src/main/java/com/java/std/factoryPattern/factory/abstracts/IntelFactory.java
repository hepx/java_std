package com.java.std.factoryPattern.factory.abstracts;

import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.cpu.IntelCpu;
import com.java.std.factoryPattern.factory.common.mainboard.IntelMainBoard;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

/**
 * INTEL工厂 实现抽象工厂
 * @author xixi
 * @date 2013-3-5
 *
 */
public class IntelFactory implements AbstractFactory {

	/**
	 *  创建INTEL的CPU
	 */
	public Cpu crateCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(775);
	}

	/**
	 * 创建INTEL主板
	 */
	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new IntelMainBoard(775);
	}

}
