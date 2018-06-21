package com.wzl.exx.fatherchild;

public class Mouse extends Animal {

	public Mouse(String myName, int myid) {
		super(myName, myid);
		// TODO Auto-generated constructor stub
	}

}

//子类拥有父类非private的属性，方法。
//子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
//子类可以用自己的方式实现父类的方法。
//Java的继承是单继承，但是可以多重继承，
//单继承就是一个子类只能继承一个父类，
//多重继承就是，例如A类继承B类，B类继承C类，所以按照关系就是C类是B类的父类，B类是A类的父类