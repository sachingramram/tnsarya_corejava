package com.arya.typecasting;

public class TypeCasting {
      
	//Property
	 
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		
		float floatVariable;
		double doubleVariable;
		
		char charVariable;
		boolean  booleanVariable;
		
		public TypeCasting(byte byteVariable, short shortVariable, int intVariable, float floatVariable, long longVariable, double doubleVariable, char charVariable, boolean booleanVariable) 
		{
			this.byteVariable= byteVariable;
			this.shortVariable=shortVariable;
			this.intVariable=intVariable;
			this.longVariable=longVariable;
			this.floatVariable=floatVariable;
			this.doubleVariable=doubleVariable;
			this.booleanVariable=booleanVariable;
		
	}
		 
			public void widening() {
				shortVariable=byteVariable;// byte-> short
				System.out.println(shortVariable);
				
				intVariable=shortVariable; // 
				System.out.println(intVariable);
				
				longVariable=intVariable; //
				System.out.println(longVariable);
				
				floatVariable=intVariable;
				System.out.println(floatVariable);
				
				floatVariable=longVariable;  // long-> float implicit 
				System.out.println(floatVariable);
				
//				charVariable=byteVariable; // char 16 bit byte 8 bit; because of positive and negative number conversion can not happen
//				
//				charVariable=shortVariable;
//				
//				charVariable=intVariable;
				
				// can not convert implicit because of size 
//				byteVariable =charVariable;
//				shortVariable =charVariable;
				
				// implicit conversion from char to int
				intVariable = charVariable;
				System.out.println(intVariable);
				
				longVariable = charVariable;
				System.out.println(longVariable);
				
				floatVariable = charVariable;
				System.out.println(floatVariable);
				
				doubleVariable = charVariable;
				System.out.println(doubleVariable);
			}
				
				// we can't convert boolean to any DataType and also any DataType To boolean
			
			// byte -> short -> int -> long -> float -> double ( for numbers only)
				
				public void narrowing () { // explicit
					
					byteVariable = (byte)shortVariable;
					System.out.println(byteVariable);
					
					floatVariable = (byte)intVariable;
					System.out.println(floatVariable);
					
					longVariable = (long)floatVariable;
					System.out.println(longVariable);
					
					charVariable = (char)byteVariable;
					System.out.println(charVariable);
				}
					
					public int expressionPromotion() {
						intVariable=(int) (intVariable+floatVariable);
						longVariable = shortVariable+intVariable;
						
						return (int)(intVariable+floatVariable);
					
				}
		}