package com.core.Objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;



public class ObjectClassEx {
	
	private static Parameter[] parameters;

	public static void main(String[] args) {
		
		User obj = new User();
		Class<? extends User> class1 = obj.getClass();
		Method[] declaredMethods = class1.getDeclaredMethods();
		for (Method m : declaredMethods) {
			
			System.out.println(m.getName());
			
		}
		Constructor<?> [] declaredConstructors = class1.getDeclaredConstructors();
		for(Constructor c : declaredConstructors) {
			parameters = c.getParameters();
			for(Parameter p : parameters) {
				System.out.println(p.getType());
				//System.out.println(c.getTypeParameters());
			
			}
			System.out.println();
		}
		System.out.println(obj.getClass());
		
		

	}

}

class User {
	
	    User() {
		
	   }
	
	String name;
	String address;
	int id;
	
	public User(String name,String address,int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	  @Override
		public int hashCode() {
			int hash = 21;
			int hashCode =  name.hashCode();
			hashCode = address.hashCode();
			hash = 12 * hash + (hashCode);
			return hash;
		}
	  
	  @Override
	  public boolean equals(Object obj) {
		  if(this == obj) {
			  return true;
		  }
		  if(obj == null) {
			  return false;
		  }
		  if (getClass() != obj.getClass()) {
				return false;
		  }
		  User other = (User) obj;
			return  name == other.name ;
			
	  }
   
   
   
  
	
	
	public String toString() {
		return "User [name ="+ name +", address ="+ address +",id ="+ id +" ]";
	}
	
}

