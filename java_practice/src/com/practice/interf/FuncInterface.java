package com.practice.interf;

public interface FuncInterface {

	void abstractFun(int x);
	
	default void normalFun()
	{
		System.out.println("hello");
	}
}
