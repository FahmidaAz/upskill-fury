package com.upskill.assigment_2;

public class Assignment_2_7 {
//	You are given two integer number (a=25, b=30), write a program to swap them and 
//    display result on the screen.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a =25;
         int b = 30;
         System.out.println("The value of a is now before swap, "+a+" and value of b is "+b);
         swapNum(a,b);
        
	}
	public static void swapNum(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("The value of a is now after swap, "+a+" and value of b is "+b);
	}

}
