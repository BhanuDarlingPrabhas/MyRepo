package com.core.Objects;



public class HashCode {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1234);
		user.setName("kb");
		user.setAddress("10-267");
		
		User user1 = new User();
		user1.setId(2315);
		user1.setName("sp");
		user1.setAddress("10");
		System.out.println(user.hashCode());
		System.out.println(user1.hashCode());
	
	}

}
