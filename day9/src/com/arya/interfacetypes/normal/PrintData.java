package com.arya.interfacetypes.normal;

public interface PrintData {
	
	void printInteger(int number);
	 void printString(String message);
	 
	 default void printHello() {
		 System.out.println("Hello");
	 }
	 
	 static void printHelloWorld() {
		 System.out.println("Hello World");
		 
//		 private void printHi(){
//			 System.out.println("Hi");
		 }
	 }


