package com.core.util.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		String str = "vikatakavi";
		HashSet<Character> hs = new HashSet<Character>();
		char[] charArray = str.toCharArray();
		for(Character c : charArray) {
			hs.add(c);
		}
		//System.out.println(str.hashCode());
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Gemeni");
		hs1.add("ETV");
		hs1.add(null);
		hs1.add("MaaTV");
		System.out.println(hs1);
		Iterator<String> it = hs1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(Character c : charArray) {
			lhs.add(c);
		}
		System.out.println(lhs);

	}

}
