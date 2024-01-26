package com.daysix.pojos.scanner.utility;
import java.util.Scanner;


public class ScannerUtility {
	public void acceptNumber() {
		//Scanner scanner=new Scanner(System.in);
		try(
				Scanner scanner=new Scanner(System.in)) {
					System.out.println("Enter an Interger Number:");
					System.out.println("Number "+	scanner.nextInt());
					
					System.out.println("Enter a float number:");
					System.out.println("Number:"+	scanner.nextInt());	
				}
				
		

	}
	public void acceptCharacter() {
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter a character:");
			System.out.println(scanner.next().charAt(0));	
			System.out.println("Enter your name:");
			System.out.println(scanner.next());
			System.out.println("Enter An address");
			scanner.nextLine();
			System.out.println(scanner.nextLine());
			
		}


}
}
