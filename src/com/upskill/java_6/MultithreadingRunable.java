package com.upskill.java_6;

public class MultithreadingRunable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		 System.out.println(Thread.currentThread().getId());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
