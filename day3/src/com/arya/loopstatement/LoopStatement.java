package com.arya.loopstatement;

public class LoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forLoop();
		whileLoop();
		doWhileLoop();
		forEachLoop();
	}
	static void forLoop() {
           for(int i=0;i<10;i++)
        	   System.out.println(i);
	}
	static void whileLoop() {
		int i=0;
		while(i<10) {
			System.out.println(i++);
			
		}
	}
		
		static void doWhileLoop() {
			int i=0;
			do
				System.out.println(i++);
			    while(i<10);
		
	}
		static void forEachLoop() {
			char[] chArray= {'1', '2', '3'};
			
			for(char ch:chArray)
				System.out.println(ch);
			boolean[] booleanArray= {true, false,true};
			for(boolean booleanVaraible:booleanArray)
				System.out.println(booleanVaraible);
			
			
		}
	

}
