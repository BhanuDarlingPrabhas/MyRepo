package com.org.Interface;

public interface RBI {
	public void depositAMT(int amount);
	public void withdrawAMT(int amount);
	public void accountInfo(AccountInfo accInfo);
   default void updateKYC(AccountInfo accInfo) {
	   System.out.println("Default concreate method from interface");
		
	}
   public static String policy() {
	   return "customer policy maintained";
	   
   }

}
