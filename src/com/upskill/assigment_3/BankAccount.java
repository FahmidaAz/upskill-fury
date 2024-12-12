package com.upskill.assigment_3;

import java.util.Scanner;
//Write a class name BankAccount which has savings and checking class. BankAccount class that has a name and an initial amount,
//which are both set in the constructor. Also, it lets users make deposits. Note that the account name must be set when an account is created.
//Demonstrates the account class hierarchy with output of:
//
//
//	a.     account name: savings
//
//	b.    initial amount: 10000
//
//	c.     new amount after deposit: 15000
//
//	d.    account name: checking
//
//	e.    initial amount: 20000
//
//	f.      new amount after deposit: 26000
//
//	g.     new amount after withdrawal: 23000

public class BankAccount {

	         
	         String accountName;
	         float initialAmount;
	         boolean bool;
	         
	         Scanner s = new Scanner(System.in);
	
	      BankAccount(String accountName){
	    	  this.accountName = accountName;
	    	  System.out.println("Account name: "+ this.accountName);
	    	  System.out.println("Please enter the initial ammount for this "+ accountName+" account");
	    	  this.initialAmount = s.nextFloat();
	    	   if(this.initialAmount <= 0){
	    		   bool =false;
	    	   }else{
	    		   System.out.println("Initial amount is : "+ this.initialAmount);
	    		   bool =true;
	    	   }
	    	   
	    	   while(bool == false){
	    		   System.out.println("Try again!! This is an invalid amount");
	    		   System.out.println("Please enter the initial ammount for this "+ accountName+" account");
	 	    	  this.initialAmount = s.nextFloat();
	 	    	  
	 	    	  if(this.initialAmount > 0){
	 	    		  bool = true;
	 	    	  }
	    	   }
	    	  
	      }
	      void depositeAmount(float amount){
	    	  this.initialAmount = this.initialAmount + amount;
	    	  System.out.println("Total amount right now in "+this.accountName+": "+ this.initialAmount);
	      }
	      void withdrawAmount(float amount){
	    	  this.initialAmount = (this.initialAmount - amount);
	    	  System.out.println("Total amount right now in "+this.accountName+": "+ this.initialAmount);
	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Savings s =new Savings();
        s.depositeAmount(100);
        Checking c = new Checking();
        c.depositeAmount(10);
        c.withdrawAmount(1000);
        s.withdrawAmount(100);
	}
	

}
class Savings extends  BankAccount{
	Savings(){
		super("Savings");
	}
}
class Checking extends  BankAccount{
	Checking(){
		super("Checking");
	}
}
