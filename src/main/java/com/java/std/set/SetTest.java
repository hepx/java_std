package com.java.std.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(null);
		s.add(new A());
		s.add(new A());
		// 由于2个A对象的hashCode返回的都是1，并且equals方法返回的是true，所以这两个对象只能存在1个
		s.add(new B());
		s.add(new B());
		// B对象的equals方法返回的永远是false，所以这两个B对象都能留下
		s.add(new C());
		s.add(new C());
		// 2个C对象hashCode返回的都是2，并且equals方法返回的是true，并且hashCode没有和以往对象相等的，所以留住1个C对象
		System.out.println(s); // 通过打印结果可以看出 HashSet无序性。

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("world");
		lhs.add("said");
		lhs.add("hello");
		System.out.println(lhs); // 按照加入顺序打印

		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(64);
		ts.add(-100);
		ts.add(0);
		System.out.println(ts); // 发现打印出来的已然是有序状态
		System.out.println("第一个：" + ts.first());
		System.out.println("最后一个：" + ts.last());
		System.out.println("小于64的最大元素（64前面的）：" + ts.lower(64));
		System.out.println("大于0的最小元素（0后面的）：" + ts.higher(0));
		System.out.println("0~100之间的：" + ts.subSet(0, 100)); // 半闭半开区间
		System.out.println("小于64的集合" + ts.headSet(64));
		System.out.println("大于或者等于0的集合" + ts.tailSet(0));

		try {
			TreeSet errorSet = new TreeSet();
			errorSet.add(new error());
			errorSet.add(new error());
		} catch (Exception e) {
			System.out
					.println("由于error类没有实现Comparable接口的compareTo方法，所以这里出现类型转换的异常");
		}

		try {
			TreeSet errorSet1 = new TreeSet();
			errorSet1.add(123);
			errorSet1.add("asd");
		} catch (Exception e) {
			System.out.println("不同类实例的比较 会出类转换异常");
		}

		// 一个定制排序的set
		TreeSet myStyleSet = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				return 0; // 一个永远平等的集合~ 你懂的~
			}

		});
	}
}

class A {
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}
}

class C {
	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

// 一个没有实现比较的类
class error {
}
