package com.upskill.assigment_2;

public class Assignment_2_2 {
//	A school conducts a 100 mark exam for its student and grades them as follows:
//	 	Grade:
//	 		Grade A: Marks>=90
//	 		Grade B: Marks>=80-89
//	 		Grade C: Marks>=70-79
//	 		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
//
//	     Write a java program to calculate the grade for a student in a method passing 
//	     parameter for grade to display every grade type, using if..else statement.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Your grade is "+ calculateGrade(100,90,95));
	 System.out.println("Your grade is "+ calculateGrade(70,70,75));
	 System.out.println("Your grade is "+ calculateGrade(10,15,5));

	}
    public static char calculateGrade(int math, int english, int java){
    	char Marks = 'F'; 
       int totalgrade = (math + english + java);
       int grade =totalgrade/3;
    	if(grade >=90){
    		Marks = 'A';
    	}else if(grade >= 80 && Marks <=89){
    		Marks = 'B';
    	}else if(grade >= 70 && Marks <=79 ){
    		Marks = 'C';
    	}else if(grade >= 60 && Marks <=69 ){
    		Marks = 'D';
    	}else if(grade <60){
    		Marks = 'F';
    	}
    	return Marks;
    }
}
