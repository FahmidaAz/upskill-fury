package com.upskill.java_4;

public class Constractor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	private String name;
	private int age;
	
	public Constractor(String name){
		this.name = name;
	}
	public Constractor(int age){
		this.age = age;
	}
	public Constractor(int age, String name){
		this.age = age;
		this.name = name;
	}
   public static void main(String[] args){
	   
	   Constractor obj = new Constractor("Azmin");
	   System.out.println(obj.name);
	   Constractor obj2 = new Constractor(25);
	   System.out.println(obj2.age);
	   Constractor obj3 = new Constractor(20,"Kazi");
	   System.out.println(obj3.age+","+obj3.name);
	   
   }
	
}
