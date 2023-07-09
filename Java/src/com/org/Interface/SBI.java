package com.org.Interface;

import java.util.Scanner;

public class SBI implements RBI{
	int balance = 9000; 
	
	SBI() {
		System.out.println(RBI.policy());
	}
	
	SBI(AccountInfo accountInfo){
		String ContinueOption = "YES";
		do {
			System.out.println("Choose option to continue");
			System.out.println("1.Deposit :");
			System.out.println("2.withdraw :");
			System.out.println("3.Account info:");
			System.out.println("4.Update KYC :");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch(option) {
			case 1:{
				System.out.println("Enter amount to deposit :");
				int amount = sc.nextInt();
				depositAMT(amount);
				continueOptions(sc,ContinueOption);
				break;
			}
			case 2:{
				System.out.println("Enter amount to withdraw :");
				int amount  = sc.nextInt();
				withdrawAMT(amount);
				continueOptions(sc,ContinueOption);
				break;
			}
			case 3: {
				accountInfo(accountInfo);
				continueOptions(sc,ContinueOption);
				break;
			}
			case 4: {
				updateKYC(accountInfo);
				continueOptions(sc,ContinueOption);
				break;
			}
			default :
				System.out.println("No Options selected :");
				
				
			}
		}
		while(ContinueOption.equalsIgnoreCase("YES"));
	}
	
	private String continueOptions(Scanner sc,String continueOption) {
		System.out.println("1.continue");
		System.out.println("2.exit");
		int opt = sc.nextInt();
		switch(opt) {
		case 1:{
			continueOption = "Yes";
			return continueOption;
		}
		case 2:{
			System.out.println("Exiting from options");
			System.exit(0);
		}
		default:
			System.out.println("Exiting from options");
			System.exit(0);
		}
		return continueOption;
		
	}
	@Override
	public void accountInfo(AccountInfo accInfo) {
		System.out.println(accInfo.toString());
	}
	@Override
	public void updateKYC(AccountInfo accInfo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number :");
		accInfo.setPhoneNumber(sc.nextLine());
		System.out.println("Updated account info :"+accInfo.toString());
	}
	@Override
	public void depositAMT(int amount) {
		System.out.println("Depositing Amount :"+amount);
		balance = balance+amount;
		System.out.println("Available balance:"+balance);
		
	}
	@Override
	public void withdrawAMT(int amount) {
		System.out.println("Withdrawing amoount :"+amount);
		balance = balance - amount;
		System.out.println("Available balance :"+balance);
	}
	
		
}
	
