package com.wzl.exx.fatherchild;

public class Dog extends Animal {
	  public Dog(String myName, int myid) {
		super(myName, myid);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		    System.out.println("dog : eat");
		  }
		  void eatTest() {
		    this.eat();   // this 调用自己的方法
		    super.eat();  // super 调用父类方法
		  }

}
