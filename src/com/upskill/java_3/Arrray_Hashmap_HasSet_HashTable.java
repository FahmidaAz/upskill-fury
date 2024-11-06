package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Arrray_Hashmap_HasSet_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 28;      //simple variable
		int [] ageFury = new int[]{12,22,32,28,25};
		String[] nameFury = new String[]{"Fahmida","Sharmin","Sana","Sayma","Rasel","Asif"};
		
		System.out.println("Student age: "+ageFury[3]);
		System.out.println("Total Student:"+ageFury.length);
		
		System.out.println("Student name: "+ nameFury[0]);
		System.out.println("Total Students: "+ nameFury.length);
		
		//multi-dimensional array
		
		int [][] ageFury2D =  new int[][]{{23,24,25,26},{32,34,35,37}};
		System.out.println("Multidimensional Age 2D: "+ageFury2D[0][2]);
		System.out.println("Multidimensional Age 2D: "+ageFury2D[1][1]);
		
		String [][] nameFury2D = new String [][]{{"Azmin","Sana"},{"Sajia","Sayma"},{"Rasel","Asif","Goutam"}};
		System.out.println("Multidimensional name 2D: "+nameFury2D[0][0]);
		System.out.println("Multidimensional name 2D: "+nameFury2D[1][1]);
		
		//Hashmap store multiple data using key-value pair, implementation of Map interface
		
		HashMap<String,Integer> Student = new HashMap<String, Integer>();
		Student.put("Fahmida", 25);
		Student.put("Tahmina", 20);
		Student.put("Gautam", 21);
		Student.put("Sana", 23);
		Student.put("Sharmin", 32);
		
		System.out.println("Student age is "+Student.get("Fahmida"));
		System.out.println("Student age is "+Student.get("Gautam"));
		
		
		//Country, capital hashmap
		HashMap<String,String> Country = new HashMap<String, String>();
		Country.put("Dhaka", "Bangladesh");
		Country.put("Washington DC", "USA");
		Country.put("London", "UK");
		Country.put("Paris", "France");
		Country.put("Milan", "Italy");
		
		System.out.println("Country name "+Country.get("London"));
		
		//Hashtable store data using key-value pair, No duplicate, also is syncronised (only one thread can be modified)
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD","Asia");
		Region.put("UK","Europe");
		Region.put("USA","North America");
		System.out.println("Region name "+Region.get("UK"));
       //Hashset store unordered collection containing unique value, Implementation of set interface
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Toyota");
		car.add("Tesla");
		System.out.println("Car name:  "+car);
		
		HashSet<String> bigTech = new HashSet<String>();
		bigTech.add("Microsoft");
		bigTech.add("Meta");
		bigTech.add("Amazon");
		bigTech.add("Apple");
		System.out.println("Company name:  "+bigTech);
		
	}
	
	
	
	
	
}
