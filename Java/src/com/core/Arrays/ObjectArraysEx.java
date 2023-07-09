package com.core.Arrays;

public class ObjectArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me obj[] = new Me[2];
		Me ob = new Me();
		ob.setName("sv");
		ob.setAddress(10267);
		Me ob1 = new Me();
		ob1.setName("kbc");
		ob1.setAddress(267);
		obj[0]=ob;
		obj[1]=ob1;
		for(Me me : obj) {
			System.out.println();
			System.out.println(me.hashCode());
			
		}
		
		

	}

}

class Me{

	String name;
	int address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Name: "+ name +", address "+ address;
	}
}
