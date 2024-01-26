package com.arya.arthimatic;

import com.arya.arthmaticutility.ArthmaticUtility;

public class ArthMatic {

	public static void main(String[] args) {
		ArthmaticUtility operation=new ArthmaticUtility(43, 20);
	int choice = 0;
	System.out.println(choice);
	do {
		choice=operation.printMenu();
		switch(choice) {
		case 1->operation.addition();
		case 2->operation.substraction();
		case 3->operation.multiplication();
		case 4->operation.division();
		case 5->operation.modulo();
		        
		}
	}while(choice!=0);

	}

}