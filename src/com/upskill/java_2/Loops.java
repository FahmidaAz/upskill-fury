package com.upskill.java_2;

public class Loops {
	
	//for loop
	//while loop
	//do while loop
	//infinite loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedLoop();
	}
	
  public static void practiceForLoop(){
	
   	for(int i = 1; i<=10; i++){
			System.out.println("for loop: "+i);
		}
	}
	
	public static void practiceWhileLoop(){
		int i = 1;
		while(i<10){
			System.out.println("while loop: "+i);
			i++;
		}
	}

	public static void practiceDoWhileLoop(){
		int i = 1;
		
		do{
			System.out.println("DO while: "+i);
			i++;
		}while(i<10);
	}
	
//	public static void practiceInfiniteLoop(){
//		for(int i = 1; ;i++){
//			System.out.println("Infinite for loop: "+i);
//		}
//	}
	
	public static void practiceNestedLoop(){
		for(int i = 1; i<=10; i++){
			for(int j =1; j<=3; j++){
				System.out.println( i +"and "+ j);
			}
		}
	}
}
