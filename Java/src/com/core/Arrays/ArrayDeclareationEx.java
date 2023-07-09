package com.core.Arrays;


public class ArrayDeclareationEx {

	public static void main(String[] args) {
		
		/*int []arr = new int[10];
		int [] arr1 = new int[]{1,2,3};
		int []arr2 = {11,22,33};
		int []arr3 = new int[10];*/
		int []arr = new int[12];
		int []arr1 = new int[]{12,23,24};
		int []arr2 = {121,45,6,8,4};
		arr = arr2; // array copy
		int []arr3  = new int[3];
		
		//arr = arr2;
		arr1[0]= 1;
		arr1[1]=4;
		
		arr2[0]=99;
		arr2[1]=990;
		
		//String []strArr = new String[12];
		//String []strArr1 = new String[] {"s","p","t"};
		//String []strArr2 = {"Sv","Sp","kb","ko","wq","er","hy","yu","op","jh"};
		//System.out.println(arr.toString());
		arr2[2]= 78;
		//arr2[3]= 99;
		//arr2[4]=22;
		System.arraycopy(arr, 1, arr3, 0, 3);

		System.out.println();
		for(int k : arr3) {
			System.out.print(k+",");
		}
		/*for(int k : arr3) {
			System.out.print(k+",");
		}
		
		for(String str : strArr2) {
			System.out.print(str+",");
		}
		System.out.println();
		arr[2]= 78;
		
		for(int k : arr) {
			System.out.print(k+",");
		}
		System.out.println();
		
		for(int k : arr) {
			System.out.print(k+",");
		}
		System.out.println();
		for(int k =0;k<arr1.length;k++) {
			System.out.print(strArr2[k]+",");
		}
		System.out.println();

		
		arr3[0]=4;
		arr3[1]=0;
		for(int k =0;k<arr1.length;k++) {
			System.out.print(arr[k]+",");
		}
		System.out.println();
		for(int k : arr3) {
			System.out.print(k+",");
		}
		User [] user = new User[3];
		User user1 = new User("User1");
		User user2 = new User("User2");
		User user3 = new User("User3");
		user[0]= user1;
		user[1]= user2;
		user[2]= user3;
		
		
		Object []object = new Object[4]; // non-similar data we can store but while iterating we need handle it
		object[0]= user1;
		object[1]= user2;
		object[2]= user3;
		object[3]= "TestString";
		
		for(Object obj : object) {
			if(obj instanceof User)
			System.out.println(((User)obj).getName());
			else
				System.out.println(obj.toString());
		}

	}*/

}
}

/*class User{
	
	public String name;
	
	public User(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}*/
	
	

