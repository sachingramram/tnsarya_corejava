package com.arya.exceptionalhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		int age=20;
		if(age>18)
			System.out.println("Eligible for Voting");
		else
//			throw new RuntimeException("Under age Exception");
			throw new Throwable("Hello");
    
//		Unreachable Code
//		System.out.println("After throw statement");
	}

}
