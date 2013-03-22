package com.java.std.factoryPattern.factory.abstracts;

import com.java.std.factoryPattern.factory.common.cpu.AmdCpu;
import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.mainboard.AmdMainBoard;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

/**
 * AMD工厂，实现抽象工厂
 * @author xixi
 * @date 2013-3-5
 *
 */
public class AmdFactory implements AbstractFactory {

	/**
	 * 创建AMD的CPU
	 */
	public Cpu crateCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	/**
	 * 创建AMD的主板
	 */
	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new AmdMainBoard(938);
	}

}
