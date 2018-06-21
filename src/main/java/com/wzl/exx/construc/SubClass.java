package com.wzl.exx.construc;

class SubClass extends SuperClass{
	  private int n;
	  
	  SubClass(){
	    super(300);
	    System.out.println("SubClass");
	  }  
	  
	  public SubClass(int n){
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	  }
	}
