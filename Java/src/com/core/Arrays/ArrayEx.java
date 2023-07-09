package com.core.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		int arr[] = new int[2]; // possible index access 0-9
		
		//String str [] = new String[10]; // possible index access 0-9
		
		arr[0] = 00;
		arr[1] = 01;
		System.out.println(arr[0]);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		int k=2;
		while(k<arr.length)
		{
			System.out.println(arr[k]);
			k++;
		}
		System.out.println();
		String str[] = new String[4];
		str[0]="hiii";
		str[1]= "king";
		str[2]= "love";
		str[3]= "wish";
		
		for(String string : str) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println(str[2]);
	}

}
