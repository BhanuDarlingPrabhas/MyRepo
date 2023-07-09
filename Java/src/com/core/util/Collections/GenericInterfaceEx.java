package com.core.util.Collections;


public class GenericInterfaceEx<T> implements GenericInterface<T>,GenericInterface1<Number> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterfaceEx<Integer> gi = new GenericInterfaceEx<>();
		gi.display(33);
		gi.displayI1(22);

	}

	@Override
	public void displayI1(Number data) {
		System.out.println(data);
		
	}

	@Override
	public void display(T data) {
		System.out.println(data);
		
	}

}

interface GenericInterface<T>{
	public abstract void display(T data);
}

interface GenericInterface1<T extends Number>{
	public abstract void displayI1(T data);
	
}
