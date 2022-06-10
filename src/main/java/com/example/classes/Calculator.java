package com.example.classes;

public class Calculator {
	
	public int testMethod() {
		return 1;
	}
	
	public int divide(int a,int b ) {
		if(b>0) {
			return a/b;
		}else {
			throw new NumberFormatException();
		}
	}
	
	public int add(int a, int b) {
		return a+b;
	}

}
