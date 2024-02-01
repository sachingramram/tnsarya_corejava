package com.arya.staticdemo;

public class StaticDemo {
	
	int number1 =10;
	static int number;
	
	public StaticDemo() {
		number1 =10;
		number =20;
	}

	
	public static void main(String[] args) {
		System.out.println(number);
		StaticDemo staticDemo= new StaticDemo();
		staticDemo.printNumber();
	}
	Student devendra =new Student();
	devendra.setRollNo(1);
	devendra.setname("Devendra");
	
	
	public void printNumber() {
		System.out.println(number);
		
	}

}
