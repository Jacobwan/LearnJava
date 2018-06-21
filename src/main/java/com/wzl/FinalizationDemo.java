package com.wzl;

public class FinalizationDemo {

	
//	它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象
	
	public static void main(String[] args) {  
	    Cake c1 = new Cake(1);  
	    Cake c2 = new Cake(2);  
	    Cake c3 = new Cake(3);  
	      
	    c2 = c3 = null;  
	    System.gc(); //调用Java垃圾收集器
	  }  
	}  
	 
	class Cake extends Object {  
	  private int id;  
	  public Cake(int id) {  
	    this.id = id;  
	    System.out.println("Cake Object " + id + "is created");  
	  }  
	  
//	  关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用
	  protected void finalize() throws java.lang.Throwable {  
	    super.finalize();  
	    System.out.println("Cake Object " + id + "is disposed");  
	  }  
}
