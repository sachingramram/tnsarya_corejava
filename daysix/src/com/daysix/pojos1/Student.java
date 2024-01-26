package com.daysix.pojos1;

public class Student {
	

	int rollNo;
	String name;
	byte age;


	// am return method(args);

	public Student() {}

	public Student(int rollNo,String name,byte age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}


	public void printProperties()
	{
	  System.out.println("Roll No:" + rollNo + "Name :"+ name +"Age :"+ age);
	}



}