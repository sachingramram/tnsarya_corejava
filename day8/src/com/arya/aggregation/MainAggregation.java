package com.arya.aggregation;

import com.arya.aggregation.address.Address;
import com.arya.javaaggregation.student.Student;

public class MainAggregation {
	
	public static void main(String[] args) {
		Student Akshat = new Student();
		Akshat.setRollNo(1);
		Akshat.setName(null);
		Akshat.setAge((byte)20);
		Akshat.setAddress(new Address("pink city", 302028, "fairmont" , true));
		
		System.out.println(Akshat);
		
		
		
		Address address = new Address();
		address.setCity("jaipur");
		address.setLandMark("fairmount");
		address.setPincode(302028);
		address.setCurrentAddress(false);
		
		Akshat.getAddress().getCity();
		System.out.println(Akshat.getAddress().getCity());
		
		Student sachin = new Student();
		sachin.setRollNo(2);
		sachin.setName("sachin");
		sachin.setAge((byte)20);
		
		sachin.setAddress(new Address("blue city", 302027, "Hawa Mahal", true ));
		
		Address sachinAddress = sachin.getAddress();
		System.out.println(sachinAddress.getCity());
		
		
		
		
	}

}