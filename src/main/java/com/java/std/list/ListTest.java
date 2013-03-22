package com.java.std.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("幼儿园");
		l.add("小学");
		l.add("幼儿园");
		l.add("中学");
		l.add("大学");
		System.out.println(l); // 可以看出可以有重复数据

		System.out.println("索引为3的元素是：" + l.get(3));

		System.out.println("幼儿园第一次出现的索引：" + l.indexOf("幼儿园"));
		System.out.println("幼儿园第最后一次出现的索引：" + l.lastIndexOf("幼儿园"));

		l.set(3, "初中"); // 类似修改操作
		l.add(4, "高中"); // 插入
		System.out.println(l);

		l.remove("幼儿园"); // 会删除第一个找到的 幼儿园
		System.out.println(l);
		l.remove(new AA()); // 由于AA的equals方法返回true，导致第一个元素被误认为是和AA相等的，于是躺着就中枪了
		System.out.println(l);
		l.remove(new BB()); // BB的equals方法返回false，所以List没有找到相等的元素删除。
		System.out.println(l);
		l.remove(0); // 通过序号删除
		System.out.println(l);
		ArrayList l1 = new ArrayList();
		l1.ensureCapacity(64); // 大的数据集合，使用这个方法一次分配好空间，避免频繁多次分配，提高性能
		l1.trimToSize(); // 调整至使用空间大小，避免内存浪费。

		try {
			List temp = Arrays.asList("小学", "中学", "大学");
			temp.remove(0);
		} catch (Exception e) {
			System.out.println("temp是一个固定长度的list，只能遍历不能操作");
		}

		LinkedList ll = new LinkedList();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.add("ddd");
		System.out.println("原始：" + ll);
		ll.addLast("zzz"); // 队列--入队
		ll.removeFirst(); // 队列--出队
		System.out.println("队列操作：" + ll);
		ll.addFirst("kkk"); // 栈--入栈
		System.out.println("kkk入栈：" + ll);
		ll.removeFirst(); // 栈--出栈
		System.out.println("kkk出栈：" + ll);
		ll.removeLast(); // 体现双端队列
		System.out.println("=========================");
		ll = new LinkedList();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.add("ddd");
		System.out.println("重新初始化：" + ll);
		ll.push("kkk"); // 栈--入栈
		System.out.println("kkk入栈：" + ll);
		ll.pop(); // 栈--出栈
		System.out.println("kkk出栈：" + ll);

		ll.offer(""); // 队列--入队
		ll.offerFirst(""); // 返回true的addFirst
		ll.offerLast(""); // 返回true的addLast

		ll.poll(); // 获取并删除第一个
		ll.pollFirst(); // 获取并删除第一个
		ll.pollLast(); // 获取并删除最后一个

		ll.peekFirst(); // 获取不删除第一个
		ll.peekLast(); // 获取不删除最后一个

		ll.removeFirstOccurrence("aaa"); // 删除第一个出现的aaa
		ll.removeLastOccurrence("aaa"); // 删除最后一个出现的aaa
	}
}

class AA {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class BB {
	@Override
	public boolean equals(Object obj) {
		return false;
	}
}
