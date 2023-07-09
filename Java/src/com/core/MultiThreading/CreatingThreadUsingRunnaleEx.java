package com.core.MultiThreading;

public class CreatingThreadUsingRunnaleEx {

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest(42);
		Thread t = new Thread(rt);
		t.start();
	}

}

class RunnableTest implements Runnable{
	
	int num;
	RunnableTest(){
			System.out.println("Default constructor");
		}
	RunnableTest(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int k =1; k<=10;k++) {
			System.out.println(num+"*"+k +" = "+ (num*k));
		}
	}
	
}
