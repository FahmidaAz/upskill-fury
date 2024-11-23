package com.upskill.assigment_5;

public class Assignment_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a method that returns the largest integer in the list. You can assume that the list has at least one element.

       int [] array = {12,20,33,21,19};
		
		
		System.out.println(maxNumber(array));

	}
	
	public static int maxNumber (int [] arr){
		int max = arr[0];
		for(int i =1; i<arr.length; i++){
			if(arr[i]>max){
			   max = arr[i];
			}
		}
		
		return max;
	
	}

}
