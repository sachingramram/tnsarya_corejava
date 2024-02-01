package com.arya.abstraction.arithmaticoperation;

public class ArithmaticOperation {
	private int number1;
	
	private int  number2;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public AbstractArithmaticOperation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	v//addition
	public int add() {
		return number1+number2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
