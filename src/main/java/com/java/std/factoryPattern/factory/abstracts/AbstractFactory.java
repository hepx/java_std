package com.java.std.factoryPattern.factory.abstracts;

import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

/**
 * 抽象工厂
 * @author xixi
 * @date 2013-3-5
 *
 */
public interface AbstractFactory {

	/**
	 * 创建CPU
	 * @return
	 */
	public Cpu crateCpu();
	
	/**
	 * 创建主板
	 * @return
	 */
	public MainBoard createMainBoard();
}
