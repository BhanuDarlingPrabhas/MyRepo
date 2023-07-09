package com.core.MultiThreading;

public class ThreadMethodsEx {

	public static void main(String[] args) throws InterruptedException {
		
		int num=21;
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int k=1;k<=10;k++) {
					System.out.println(num+" * "+k+" = "+(num*k));
				}
			}
		};
		//t.setName("user-defined-Thread1");
		//t.start();
		//System.out.println("is alive: "+t.isAlive());
		//t.join();
		//System.out.println("is alive: "+t.isAlive());
		int num1 = 24;
		for (int k = 1; k <= 10; k++) {
			System.out.println(num1 + " * " + k + " = " + (num1 * k));
			Thread.yield();
		}
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		int num2 = 34;
		Thread t2 = new Thread() {
			@Override
			public void run() {
			for(int k =1; k<=10;k++) {
				System.out.println(num2 + " * "+ k+ " = "+ (num2*k));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		};
		t2.start();
		t2.interrupt();
		System.out.println("Interruped: "+t.isInterrupted());
		System.out.println("is alive: "+t.isAlive());

	}
	
	

}



