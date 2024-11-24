package com.upskill.java_6;

public class MultithreadingThread extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		try{
		 System.out.println(Thread.currentThread().getId());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
