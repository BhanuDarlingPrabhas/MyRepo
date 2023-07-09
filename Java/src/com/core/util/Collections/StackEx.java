package com.core.util.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(22);
		s.push(11);
		s.push(null);
		s.add(89);
		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		ListIterator<Integer> listIterator = s.listIterator(s.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println();
		Enumeration<Integer> e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("top of the element in the stack: "+ s.peek());
		System.out.println();
		System.out.println("Removing elements");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(s);

	}

}
