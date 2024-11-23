package com.upskill.java_4;

import com.upskill.java_1.MethodType;

/* Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

public class Polymorphism extends MethodType{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car();
		car(5);
		car("Black");
		car(true);
		car(false, 60000);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();

	}
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 30000;
		int bonus = 20000;
		int sideHussle = 25000;
		int newIncome =(calculateAnnualIncome+rentalIncome+bonus+sideHussle);
		System.out.println("My Annual Income = " +newIncome );
	}
	public static void car(){
		System.out.println("My car is Tesla");
	}
	public static void car(int seat){
		System.out.println("My car is Tesla. It has "+seat+" seat.");
	}
	public static void car(String color){
		System.out.println("My car is Tesla. It is "+color+" color.");
	}
	
	public static void car(boolean selfDriven){
		System.out.println("My car is Tesla. It is "+selfDriven+" that it's self driven.");
	}
	public static void car(boolean selfDriven, int price){
		System.out.println("My car is Tesla. It is "+selfDriven+" that it's self driven. It costs "+price+" dollar.");
	}

}
