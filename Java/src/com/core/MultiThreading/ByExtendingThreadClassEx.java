package com.core.MultiThreading;

public class ByExtendingThreadClassEx {

	public static void main(String[] args) {
		PrintTable pt = new PrintTable(190);
		
		//PrintTable obj1 = new PrintTable(13);
		
		//PrintTable obj2 = new PrintTable(14);
		pt.start();
		
		//obj1.start();
		
		//obj2.start();
	}
}


 class PrintTable extends Thread {
	 
	 int num ;
	 PrintTable(){
		 
	 }
	 PrintTable(int num){
		 this.num = num;
	 }
 
	 
	 @Override
	 public void run() {
		 for(int k=1;k<=10;k++) {
			 System.out.println(num+ "*" +k+ " ="+ (num*k));
		 }
	 }
	
}