package com.arya.bank;

import com.arya.bank.entities.Account;
import com.arya.bank.interfaces.Bank;

public class Bankapp {
	public static void main(String[] args) {
		Account account=new Account(1001,"XYZ",100000);
		float amount=10000;
		
		 Bank bankDeposit =( account1,  amount1)->{
			 if(amount<=Bank.DEPOSIT_LIMIT) {
				 account1.setBalance(account.getBalance()+amount1);
				 return "success";
				 
			 }else
				 return "Unsuccessful Transaction...";
		 };
		 Bank bankWithdraw =( account1,  amount1)-> {
			  if(Bank.MIN_BALANCE < account1.getBalance()-amount1) {
				  account1.setBalance(account1.getBalance()-amount);
				  
				  return " successful";
			  }
			  else
					  
					  return "Unsuccessful Transaction...";
			  
		 };
		 
		 String depositMessage=bankDeposit.transaction(account,amount);
		 
		 if(depositMessage=="success")
			 System.out.println(account);
		 else
			 System.out.println(depositMessage);
		 
		 
		 String withdrawMessage=bankWithdraw.transaction(account, 99500);
		 if(withdrawMessage=="successful")
			 
		 System.out.println(account);
		 else
			 System.out.println(withdrawMessage);
		 
//		 System.out.println(depositMessage + withdrawMessage);
	}

}
