package com.upskill.assigment_2;

public class Assignment_2_6 {
	//Write a java program to find the prime number from 1 to 100 and print them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=100; i++){
			if(isPrime(i)){
				System.out.print(i +"\t");
			}
			
		}
      
	}
	
	public static boolean isPrime(int num){
		
		for(int i =2; i<=Math.sqrt(num); i++){
			if(num%i == 0){
				return false;
			}
		}
			return true;
		
	}

}
