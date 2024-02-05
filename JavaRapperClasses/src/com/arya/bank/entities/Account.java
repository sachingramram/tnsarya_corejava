package com.arya.bank.entities;

public class Account implements Valid{
	
	private int accountNo;
   private	String name;
	private float balance;
	public Account(int accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stu
	}
	
	

}
