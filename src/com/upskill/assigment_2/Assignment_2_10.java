package com.upskill.assigment_2;

public class Assignment_2_10 {
	//Write a Java program to convert temperature from Fahrenheit to Celsius degree. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Fehrenheit = 35;
       conversion(Fehrenheit);
	}
	
	public static void conversion(double fehrenheit){
		double celsius =(fehrenheit - 32) *5/9;
		
		System.out.printf("When it's %.2f degrees in Fahrenheit, it will be %.2f degrees in Celsius.%n", fehrenheit, celsius);
	}

}
