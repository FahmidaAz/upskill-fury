package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =  101;
		if(age<=13){
			System.out.println("You are a kid.");
		}else if(age>13 && age<18){
			System.out.println("You are a teenager.");
		}else if(age>60){
			if(age>100){
				System.out.println("You are a champion.");
			}else{
			System.out.println("You are a senior.");
			}
		}
		else{
			System.out.println("You are an adult.");
		}
		
		

	}

}
