package com.arya.datatype;

public class DataType {

	public static void main(String[] args) {
		byteDataType();
		longDataType();
		integerDataType();
		shortDataType();
		charDataType();
		booleanDataType();
	 

	}
	
	
	public static void byteDataType() {
		byte byteMaxVariable=Byte.MAX_VALUE;
		 byte byteMinVariable=Byte.MIN_VALUE;
		 System.out.println("Byte Max:"
				 +byteMaxVariable
				 +"Min"
				 +byteMinVariable);
		
	}
	public static void longDataType() {
		Long LongMaxVariable=Long.MAX_VALUE;
		Long LongMinVariable=Long.MIN_VALUE;
		 System.out.println("Long Max:"
				 +LongMaxVariable
				 +"Min"
				 +LongMinVariable);
	}
	
	public static void integerDataType() {
		Integer integerMaxVariable=Integer.MAX_VALUE;
		Integer integerMinVariable=Integer.MIN_VALUE;
		 System.out.println("Int Max:"
				 +integerMaxVariable
				 +"Min"
				 +integerMinVariable);
	}
	public static void shortDataType() {
   	 short shortMaxVariable = Short.MAX_VALUE;
	     short shortMinVariable = Short.MIN_VALUE;
	     
	     System.out.println("short Max:" 
	    	                  +shortMaxVariable
	    	                  +"Min:"
	    	                  +shortMinVariable
	 	                  );
	}
	public static void charDataType() {
		char ch='A';  // datatype variable:
		 System.out.println(ch);
		
		 ch ='\u0000';
		 System.out.println(ch);
		 
		 ch=65;
		 System.out.println(ch);
	}
	
	 static void booleanDataType() {
		boolean isValid= true;
		if(isValid)
			System.out.println("True");
	}

}