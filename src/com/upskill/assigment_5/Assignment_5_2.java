package com.upskill.assigment_5;

public class Assignment_5_2 {
//	Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//    For numbers which are multiples of both three and five return 'FizzBuzz'.
//For numbers that are neither, return the input number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkMultiple(15));
		System.out.println(checkMultiple(12));
		System.out.println(checkMultiple(25));
		System.out.println(checkMultiple(11));
		

	}
	public static String checkMultiple(int num){
		String result;
		if(num %5 == 0 && num%3 == 0){
			result = "FizzBuzz";
		}
		else if(num %3 == 0){
			result = "Fizz";
		}else if(num %5 == 0){
			result ="Buzz";
		}else {
			result = "Neither, the number is "+ num;
		}
		
		return result;
	}

}
