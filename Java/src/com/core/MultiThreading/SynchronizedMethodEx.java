package com.core.MultiThreading;

public class SynchronizedMethodEx {

	public static void main(String[] args) {

		Tables1 obj = new Tables1();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.printTable1(10);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.printTable1(11);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj.printTable1(12);
			}
		};
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
	}

}

class Tables1 {
	
	public synchronized void printTable1(int num) {
		for (int k = 1; k <= 10; k++) {
			System.out.println(num + "*" + k + " = " + (num * k));
		}
	}
}
