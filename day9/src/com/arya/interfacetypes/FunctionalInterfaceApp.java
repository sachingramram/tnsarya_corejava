package com.arya.interfacetypes;

import com.arya.interfacetypes.functional.Addition;
import com.arya.interfacetypes.functional.ArithmaticOperation;
import com.arya.interfacetypes.functional.Subtraction;
public class FunctionalInterfaceApp {
   
	public static void main(String[] args) {
		ArithmaticOperation addition =new Addition();
		int result=addition.opereation(10,20);
		System.out.println(result);
		//polymorphism
//		addition=new Subtraction();
//		ArithmaticOperation subtraction =new Subtraction();
		System.out.println(addition.opereation(20,10));
		
//annonymous class
		
		ArithmaticOperation multiplication =
				new ArithmaticOperation() {
			 

			@Override
			public int opereation(int number1, int number2) {
				// TODO Auto-generated method stub
				return number1*number2;
			}
		};
		 
		System.out.println(multiplication.opereation(10,10));
		
		//lambda expression
		ArithmaticOperation division= new ArithmaticOperation() {
			
			@override
		
			
		};
		
	}
}
