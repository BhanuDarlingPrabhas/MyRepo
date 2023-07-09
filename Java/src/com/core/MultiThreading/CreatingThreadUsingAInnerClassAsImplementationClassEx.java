package com.core.MultiThreading;

public class CreatingThreadUsingAInnerClassAsImplementationClassEx {

	public static void main(String[] args) {
		
		int num =79;
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for(int k=1;k<=10;k++) {
					System.out.println(num+"*"+k+" = "+(num*k));
				}
				
			}
			
		};
		Thread t = new Thread(runnable);
		t.start();

	}

}
