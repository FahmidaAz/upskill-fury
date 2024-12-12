package com.upskill.assigment_3;

import java.util.Scanner;

//Bank is a class that provides functionality to get interest rate. 
//Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. Hints: using method override.

public class Assignment_3_3 {
	
	
	  void displayInterestRate(){
		  System.out.println("Nothing to show. Select your bank name");
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Assignment_3_3 bank = new ChaseBank();
        bank.displayInterestRate();
        new CityBank().displayInterestRate();
        new TDBank().displayInterestRate();
        
        
        
	}

}

class ChaseBank extends Assignment_3_3{
	void displayInterestRate(){
		System.out.println("Interest rate of chase bank is 8%");
	}
}
class CityBank extends Assignment_3_3{
	void displayInterestRate(){
		System.out.println("Interest rate of city bank is 7%");
	}
}
class TDBank extends Assignment_3_3{
	void displayInterestRate(){
		System.out.println("Interest rate of TD bank is 9%");
	}
}
