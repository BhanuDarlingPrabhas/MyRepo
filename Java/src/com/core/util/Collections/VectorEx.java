package com.core.util.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		v.add("king");
		v.add("Queen");
		Enumeration<String> e = v.elements();
		System.out.println("Printing using enumarator");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Printing using iterator");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Printing using ListIterator");
		ListIterator<String> lit = v.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}

	}

}
