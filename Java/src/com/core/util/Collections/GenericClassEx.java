package com.core.util.Collections;

public class GenericClassEx {

	public static void main(String[] args) {
		
		Generic<Integer> genericInteger = new Generic<Integer>(12);
		Generic<String> genericString = new Generic<String>("me");
		System.out.println(genericInteger.getData());
		System.out.println(genericString.getData());
		GenericSpecific<Integer> gs = new GenericSpecific<Integer>(21);
		GenericSpecific<Long> gs1 = new GenericSpecific<Long>(Long.valueOf(13L));
		GenericSpecific<Float> gs2 = new GenericSpecific<Float>(Float.valueOf(34F));
		GenericSpecific<Double> gs3 = new GenericSpecific<Double>(Double.valueOf(37.5));
		System.out.println(gs.getData());
		System.out.println(gs1.getData());
		System.out.println(gs2.getData());
		System.out.println(gs3.getData());

	}

}

class Generic<T> {
	
	private T data;
	
	public Generic(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
		
	}
	
}

class GenericSpecific <T extends Number>{
	
	private T data;
	
	public GenericSpecific(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
