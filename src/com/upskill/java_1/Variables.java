package com.upskill.java_1;

public class Variables {

//	Variables in Java

	public String country = "USA";			//Instance OR global variable - Variables declared in Class level, outside method
	public static String region = "America"; //Static variable - variables belong to class and don't required creating object
	
	public void ny(String county){			//Method parameter - variables used as method parameter
		
		String city = "NYC";			//Local variable - variables declared in methods
		
		System.out.println("--- NY Method ---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
	}
	
	public void nj(String county){			//Method parameter - variables used as method parameter
		
		String city = "Paterson";		//Local variable - variables declared in methods
		
		System.out.println("--- NJ Method ---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
	}
	
	public static void main(String[] args) {
		
		Variables myobj = new Variables();			//ClassName objName = new ClassName();
		myobj.ny("Queens");
		myobj.nj("Essex");
		
		System.out.println("--- Static / NonStatic ---");
		System.out.println(myobj.country);
		System.out.println(region);
	}
}