package com.practice.interf;

// A simple Java program to demonstrate multiple 
// inheritance through default methods. 
interface PI1 
{ 
	// default method 
	 void show() ; 
} 

interface PI2 
{ 
	// Default method 
	void show() ;
	 
} 

// Implementation class code 
class TestClass implements PI1, PI2 
{ 
	// Overriding default show method 
	public void show() 
	{ 
		// use super keyword to call the show 
		// method of PI1 interface 
		System.out.println("hi");
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.show(); 
	} 
} 
