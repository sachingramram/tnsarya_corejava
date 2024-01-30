package com.arya.accessmodifiers;

public class App {
	private  static String message;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMessage();
		Display display=new Display();
		display.age=10;
		System.out.println(display.age);

	}
	public static void showMessage() {
		System.out.println(message);
	}

}