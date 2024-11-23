package com.upskill.java_4;

public class SIngleton {

	private SIngleton(){
		
	}
	private static SIngleton SingleTonObj = new SIngleton();
	protected void demo(){
		System.out.println("Demo method for singleton class");
	}
	protected void fury(){
		System.out.println("Demo method for singleton fury class");
	}
	protected void falcon(){
		System.out.println("Demo method for singleton falcon class");
	}
	protected void loki(){
		System.out.println("Demo method for singleton loki class");
	}
	public static SIngleton getInstance(){
		return SingleTonObj;
	}
}
