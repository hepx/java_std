package com.java.std.factoryPattern.factory.simple;

import com.java.std.factoryPattern.factory.common.mainboard.AmdMainBoard;
import com.java.std.factoryPattern.factory.common.mainboard.IntelMainBoard;
import com.java.std.factoryPattern.factory.common.mainboard.MainBoard;

public class MainBoardFactory {

	private static MainBoard mainBoard;
	
	public static MainBoard createMainBoard(int type){
		if(type==1){
			mainBoard=new IntelMainBoard(755);
		}else if(type==2){
			mainBoard=new AmdMainBoard(938);
		}
		return mainBoard;
	}
}
