package com.core.Arrays;

public class TypesOfArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[2];
		String str1[] = {"nenu","me","also me"};
		for(String s : str1) {
			System.out.println(s);
		}

		int arr[][] = {{10,11,12},{14,15,16,1000},{99,88,00}};
		for(int k=0;k<arr.length;k++) {
			for(int i=0;i<arr[k].length;i++) {
				System.out.println(arr[k][i]);
				
			}
		}
	}

}
