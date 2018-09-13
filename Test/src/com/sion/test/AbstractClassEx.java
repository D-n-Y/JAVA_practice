package com.sion.test;

public abstract class AbstractClassEx {
	
	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractCleassEx constructor");
	}
	
	public AbstractClassEx(int i, String str) {
		System.out.println("AbstractCleassEx constructor");
		
		this.num = i;
		this.str = str;
	}
	
	public void fun1() {
		System.out.println(" -- fun1() START -- ");
	}

	public abstract void fun2();
}
