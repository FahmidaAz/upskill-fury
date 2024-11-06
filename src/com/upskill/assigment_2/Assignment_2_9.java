package com.upskill.assigment_2;

public class Assignment_2_9 {
//	Write a program to swap two string variables (Talen, Tech) and display result on the 
//    screen.  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="Talen";
        String b = "Tech";
        System.out.println("The value of a before swap is, "+a+" and value of b is "+b);
        swapString(a,b);
       
	}
	public static void swapString(String a, String b){
		String temp = a;
		a = b;
		b = temp;
		
		System.out.println("The value of a is now after swap, "+a+" and value of b is "+b);
	}

		
	}


