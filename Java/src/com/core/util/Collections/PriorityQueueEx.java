package com.core.util.Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(11);
		pq.add(22);
		pq.add(33);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(99);
		dq.add(89);
		System.out.println(dq);
		dq.addFirst(3);
		System.out.println(dq);
		dq.addLast(9);
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.poll());
		System.out.println(dq);

	}

}
