package com.org.Interface;

public class C1 implements I2,I1{

	@Override
	public void run() {
		System.out.println("good running");
		
	}

	@Override
	public void kill() {
		System.out.println("dont kill");
		
	}
}
