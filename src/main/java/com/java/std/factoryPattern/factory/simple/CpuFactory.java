package com.java.std.factoryPattern.factory.simple;

import com.java.std.factoryPattern.factory.common.cpu.AmdCpu;
import com.java.std.factoryPattern.factory.common.cpu.Cpu;
import com.java.std.factoryPattern.factory.common.cpu.IntelCpu;

/**
 * CPU 工厂类
 * @author xixi
 * @date 2013-3-4
 *
 */
public class CpuFactory {

	private static Cpu cpu;
	
	public static Cpu createCpu(int type){
		if(type==1){
			cpu=new IntelCpu(755);
		}else if(type==2){
			cpu=new AmdCpu(938);
		}
		return cpu;
	}
}
