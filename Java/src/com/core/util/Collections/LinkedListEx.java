package com.core.util.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(20);
		li.add(90);
		
		System.out.println(li);
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Prinitng using listIterator forward direction");
		ListIterator<Integer> lit = li.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("Prinitng using listIterator backword direction");
		ListIterator<Integer> lit1 = li.listIterator(li.size());
		while(lit1.hasPrevious()) {
			System.out.println(lit1.previous());
		}

	}

}
