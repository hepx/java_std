package com.java.std.paramPass;

/**
 * JAVA参数传递，对象传递，对象传递其本质是传递指向对像引用的一个副本。
 * @author xixi
 * @date 2013-3-14
 *
 */
public class ObjectTypePass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setName("jeke");
		//传递的是引用副本，
		changePerson(person);
		System.out.println(person.getName());
		changePerson2(person);
		System.out.println(person.getName());
	}
	/**
	 * 引用副本操作指向的同一对象，结果会发生变化
	 * @param p
	 */
	public static void changePerson(Person p){
		p.setName("pite");
	}
	
	/**
	 * 引用的副本重新指向了一个新的对象。对新对象的操作不会改变原对象。
	 * @param p
	 */
	public static void changePerson2(Person p){
		p=new Person();
		p.setName("lili");
	}

}
