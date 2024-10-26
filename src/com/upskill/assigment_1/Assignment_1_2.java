package com.upskill.assigment_1;

public class Assignment_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = 9;
		int length = 13;
		
		
    System.out.println("The parimeter of the rectangle is: "+rectanglePerimeter(width, length));
	}
	
	public static int rectanglePerimeter(int w, int l){
		
		 int perimeter = 2*(w + l);
		 
		return perimeter;
	}

}
