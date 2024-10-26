package com.upskill.assigment_1;

public class Assignment_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		
	System.out.println("The largest number is :"+largeNum(b,c));
	System.out.println("The smallest number is :"+smallNum(a,b));
   System.out.println("The substraction of the large and the small number is: "+ (largeNum(b,c) - smallNum(a,b)));
	}
	
	public static int largeNum(int b, int c){
		int sum = b+c;
		return sum;
	}
	
	public static int smallNum(int a, int b){
		int sum = a+b;
		return sum;
	}

}
