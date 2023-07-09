package com.core.MultiThreading;

import java.util.Scanner;

public class ProducerConsumerEx {

	public static void main(String[] args) {
		
		AccountDetails accountDetails =  new AccountDetails("Bhanu",5000);
		Producer producer = new Producer(accountDetails);
		Consumer consumer = new Consumer(accountDetails);
		new Thread(consumer,"consumer1").start();
		new Thread(consumer,"consumer2").start();
		new Thread(producer,"Producer").start();
	}

}


class AccountDetails{
	
	String accountName;
	long balance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance=balance;
	}
	public AccountDetails(String accountName,long balance) {
		super();
		this.accountName=accountName;
		this.balance=balance;
	}
	
}


class Producer extends Thread{
	
	AccountDetails accountDetails;
	
	Producer(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			String name = Thread.currentThread().getName();
			System.out.println(name+" Started ");
			synchronized(accountDetails) {
				System.out.println("Enter amount for Deposit");
				long amt = accountDetails.getBalance();
				long requestedAmt = sc.nextLong();
				accountDetails.setBalance(amt+requestedAmt);
				System.out.println("Deposit completed");
				accountDetails.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread{
	
	AccountDetails accountDetails;
	Consumer(AccountDetails accountDetails) {
		this.accountDetails= accountDetails;
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Started");
		synchronized (accountDetails) {
			try {
				System.out.println(name +" Waiting");
				accountDetails.wait();
				System.out.println(name +" Got notified");
			} catch (Exception e) {
				
				}
			System.out.println("Enter amount to withdraw");
			long amt = accountDetails.getBalance();
			long requestedAmt =  sc.nextLong();
			accountDetails.setBalance(amt+requestedAmt);
			System.out.println("Withdraw completed");
		}

	}
	
}




