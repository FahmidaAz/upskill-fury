package com.upskill.assigment_1;

public class Assignment_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 12;
	 System.out.println(a+b+tax(a,b));

	}
	public static double tax(int a, int b){
		double result = (a+b) % .40;
		return result;
	}

}
