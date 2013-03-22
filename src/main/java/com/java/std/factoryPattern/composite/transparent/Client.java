package com.java.std.factoryPattern.composite.transparent;


public class Client {
	
	public static void main(String []orgs){
		//这种透明的模式，客户端就可以统一用抽象类来定义。
        Compontent root = new Composite("服装");
        Compontent c1 = new Composite("男装");
        Compontent c2 = new Composite("女装");
        
        Compontent leaf1 = new Leaf("衬衫");
        Compontent leaf2 = new Leaf("夹克");
        Compontent leaf3 = new Leaf("裙子");
        Compontent leaf4 = new Leaf("套装");
        
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        
        root.printStruct("");
	}
}
