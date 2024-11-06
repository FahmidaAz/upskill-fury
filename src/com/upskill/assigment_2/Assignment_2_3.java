package com.upskill.assigment_2;

public class Assignment_2_3 {
//	Write two java functions which will return two different integer values, write a 
//		     program to compare those numbers and send message that one number is bigger 
//		     than other. (hints: using if..else)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = firstNum();
		int b = secondNum();
		int largeNumber = largeNum(a,b);
		
		System.out.println("First number is "+a + ", Second Number is "+ b+" and the largest number between them is "+ largeNumber);
       
	}
	
	public static int firstNum(){
		return 70;
	}
	public static int secondNum(){
		return 25;
	}
   public static int largeNum(int a, int b){
	   if(a<b){
		  return b; 
	   }else{
		   return a;
	   }
   }
}
