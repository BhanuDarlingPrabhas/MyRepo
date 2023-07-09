package com.core.util.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new MySorting());
		ts.add("amma");
		ts.add("Ball");
		ts.add("Cat");
		ts.add("Key");
		ts.add("Tree");
		//ts.add(null);
		ts.add("Collection");
		System.out.println(ts);
		
		TreeSet<User> ts1 = new TreeSet<User>();
		User user = new User("Emp3", 55);
		User user1 = new User("Emp2", 99);
		ts1.add(user);
		ts1.add(user1);
		
		System.out.println(ts1);
		
		
	}

}

class MySorting implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

class User implements Comparable<User>{
	
	String name;
	int age;
	
	public User(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(User o) {
		return o.name.compareTo(this.name);
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
