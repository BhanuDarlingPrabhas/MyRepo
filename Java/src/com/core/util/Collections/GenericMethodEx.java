package com.core.util.Collections;


public class GenericMethodEx {

	public static void main(String[] args) {
	
		GenericMethod gm = new GenericMethod();
		gm.<String>genericMethod("kb");
		gm.<Integer>genericMethod(123);
		GenericMethod1 gm1 = new GenericMethod1();
		gm1.<Integer>genericMethod(123);
	}

}


class GenericMethod{
	
	public <T> void genericMethod(T data) {
		System.out.println(data);
	}
	
}

class GenericMethod1{
	
	public <T extends Number> void genericMethod(T data) {
		System.out.println(data);
	}
}