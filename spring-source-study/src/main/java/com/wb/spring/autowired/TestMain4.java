package com.wb.spring.autowired;

import java.util.ArrayList;

public class TestMain4 {

	public static void main(String[] args) {
		/**
		 * 上界通配符，通配符?只能是 T 和 T 的子类
		 * add(): 不可以加入任何元素，除了null
		 * get():返回的值的类型默认是T
		 */
		ArrayList<? extends Number> list1 = new ArrayList<Integer>(); //子类
		//list1.add(1);    //编辑报错，因为通配符?可能是T或T的子类
		list1.add(null); //null可以，因为null可以为任何类型，但无意义

		Number number = list1.get(0); //默认是T类型，从声明泛型集合时我们知道，可以声明T和T的子类任何一个，所以返回默认只能是T，如果是子类再强转
		Integer integer = (Integer) list1.get(0); //可以强转成子类型，但如果不是Integer会包运行错误java.lang.ClassCastException

		/**
		 * 下界通配符，通配符?只能是 T 和 T 的父类
		 * add(): 只能添加类型为 T 和 T 的子类
		 * get():返回的值默认是 Object类型
		 */
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2.add(1);
		list2.add(1L);
		list2.add(1.1f);
		list2.add(2.5d);

		Object object = list2.get(0); //默认是Object类型，因为在add()时可以是T和T的子类，所以返回默认是Object

		System.out.println(object);
	}

}
