package com.upskill.java_3;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name ="Upskill";  //write & read set and get
	private int ssn = 2232343;       // write only set
	private String username = "AzminFahmida"; //read only
	
	//Setter method
	public void setName (String value){
		name = value;
	}
	public void setSSN (int value){
		ssn = value;
	}
	
   public String getName(){
	   return name;
   }
   
   public String getUsername(){
	   return username;
   }
   
   public static void main(String [] arg){
	   Encapsulation obj = new Encapsulation();
	   //obj.getName();
	   System.out.println(obj.getName());
	   obj.setName("Azmin");
	   System.out.println(obj.getName());
	   
	   obj.setSSN(34345424);
	   System.out.println(obj.getUsername());
	   
	   
   }
}
