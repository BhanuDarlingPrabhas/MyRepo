package com.core.MultiThreading;

import java.util.Scanner;

public class ThreadCommunicationEx {
    
	public static void main(String[] args) {
		
		Transactions obj = new Transactions();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					obj.withDrawAmt();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
					obj.depositAmt();
				
			}
		};
		Thread t3 = new Thread() {
		@Override
		public void run() {
			try {
				obj.withDrawAmt();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread t4= new Thread() {
		public void run() {
			obj.depositAmt();
		}
	};
		
	t1.setName("Thread-1");
	t2.setName("Thread-2");
	t3.setName("Thread-3");
	t4.setName("Thread-4");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}

class Transactions {
	
	Scanner sc = new Scanner(System.in);
	long balance = 20000;
	public synchronized void withDrawAmt() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ " Started");
		System.out.println("Enter amount to withdraw");
		int amount = sc.nextInt();
		while(balance<=amount) {
			System.out.println("Thread is waiting due to low balance :"+Thread.currentThread().getName());
			wait();
			System.out.println("Got notified for deposit amount: "+Thread.currentThread().getName());
		}
		balance -= amount;
		System.out.println("Withdraw completed and available balance : "+balance);
	}
	
	public synchronized void depositAmt() {
		System.out.println(Thread.currentThread().getName() + "started");
		System.out.println("Enter amount to deposit");
		int amount = sc.nextInt();
		balance = balance+amount;
		System.out.println("Deposit completed and available balance :"+balance);
		notifyAll();		
	}

}
