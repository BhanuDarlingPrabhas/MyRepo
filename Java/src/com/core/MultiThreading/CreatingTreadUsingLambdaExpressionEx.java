package com.core.MultiThreading;

public class CreatingTreadUsingLambdaExpressionEx {

	public static void main(String[] args) {
		int num = 67;
		Runnable r = ()->{
			for(int k=1;k<=10;k++) {
				System.out.println(num+"*"+k+" = "+(num*k));
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
