package com.upskill.assigment_3;

import java.util.Scanner;

//Write a java program which will display 5 employee information(name, age, salary and address).

public class Assignment_3_2 {
	
	   String name;
	   int age;
	   int salary;
	   String address;
	
	Assignment_3_2(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the name of your employee: ");
		this.name =  s.next();
		System.out.println("Please enter the age of your employee: ");
		this.age = s.nextInt();
		System.out.println("Please enter the salary of your employee: ");
		this.salary = s.nextInt();
		System.out.println("Please enter the address of your employee: ");
		this.address = s.next();
	}
    void displayEmployee(){
    	System.out.println("Name: "+ this.name);
    	System.out.println("Age: "+ this.age);
    	System.out.println("Salary: "+ this.salary);
    	System.out.println("Address: "+ this.address);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Assignment_3_2 [] employee = new  Assignment_3_2[5];
      for(int i =0; i<employee.length; i++){
    	employee[i] = new Assignment_3_2();
    	
      }
      System.out.println("Displaying 5 employee's information: \t");
      for(int i=0; i<employee.length; i++){
    	  System.out.println("\t");
    	  employee[i].displayEmployee();
    	 System.out.println("--------------");
      }
     
	}

}
