package com.arya.typecastingstatement;

 
import com.arya.typecasting.TypeCasting;

public class TypeCastingReal {

	public static void main(String[] args) {
		// Widening or implicit type casting
		
		byte byteVariable = 10;
		short shortVariable = 20;
	
		TypeCasting typeCast = new TypeCasting(byteVariable, shortVariable, 30,  'A', true);
		
		typeCast.widening();
		typeCast.narrowing();
	}
}