package com.core.util.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(45);
		al.add(66);
		al.add(99);
		System.out.println(al);
		
		System.out.println(al.get(1));
		System.out.println(al.set(1, 345));
		System.out.println(al.get(1));
		System.out.println(al.remove(0));
		//System.out.println(al.remove(al));
		System.out.println(al);
		
		Iterator<Integer> iterator = al.iterator();//It will iterate only forward direction
		while(iterator.hasNext()) {
			System.out.println("iterator: "+iterator.next());
		}
		
		ListIterator<Integer> listIterator = al.listIterator(al.size());//It will iterate in both directions
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previousIndex());
			System.out.println("List-iterator: "+listIterator.previous());
		}
		
		Collection c1 = new ArrayList();	
		c1.add(34);
		c1.add(44);
		c1.add("bhnau");
		
		Collection c2 = new ArrayList();
		c2.add(22);
		c2.add(11);
		
		Collection c = new ArrayList();
		c.add(12);
		c.add(23);
		c.add(24);
		System.out.println(c);
		System.out.println("c Size: "+c.size());
		System.out.println("c isEmpty: "+c.isEmpty());
		System.out.println("c1 is empty: "+c1.isEmpty());
		System.out.println("c containsof 12:"+c.contains(12));
		System.out.println("c contains of 167: "+c.contains(167));
		
		Object[] array = c.toArray();//convert collection to array
		for(Object obj : array) {
			System.out.println(obj);
		}
		
		System.out.println();
		Iterator iterator1 = c.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		boolean remove = c.remove(24);
		System.out.println(remove);
		System.out.println(c);
		c.addAll(c1);
		c.addAll(c2);
		System.out.println(c);
		
		System.out.println(c.containsAll(c1));
		System.out.println(c.containsAll(c2));
		System.out.println(c.removeAll(c1));
		System.out.println(c.retainAll(c1));
		System.out.println(c);
		al.removeIf(n -> (n <=34));
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(al);
		
		List<Integer> collect = al.stream().filter(n -> n>38).collect(Collectors.toList());
		//System.out.println(collect);
		
		Spliterator<Integer> spliterator = collect.spliterator();
		spliterator.forEachRemaining(n -> {
			System.out.println(n);
		});
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add("sv");
		list.add(12);
		list.add(21);
		list.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
