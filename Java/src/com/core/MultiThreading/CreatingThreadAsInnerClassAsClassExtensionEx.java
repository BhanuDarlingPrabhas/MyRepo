package com.core.MultiThreading;

import java.util.Scanner;

public class CreatingThreadAsInnerClassAsClassExtensionEx {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = sc.nextInt();
		
		Thread thread = new Thread() {  //override the run method inside thread class
			@Override
			public void run(){
				for(int k = 1;k<=10;k++) {
					System.out.println(num+"*"+k+" = "+(num*k));
				}
			}
		};
		thread.start();
		sc.close();
		
		

	}

}
