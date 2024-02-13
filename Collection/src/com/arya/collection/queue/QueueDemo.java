package com.arya.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> integerQueue = new PriorityQueue<>();
		integerQueue.add(4);
		integerQueue.add(2);
		integerQueue.add(3);
		System.out.println(integerQueue);
		//poll() to remove an element
		integerQueue.poll();
		System.out.println(integerQueue);
		integerQueue.poll();
		System.out.println(integerQueue);
		integerQueue.poll();
		System.out.println(integerQueue);
		
		Queue<String> nameQueue=new PriorityQueue<>();
		nameQueue.add("Vishal");
		nameQueue.add("Sachin ");
		nameQueue.add("Yogi");
		nameQueue.add("Rajesh");
		System.out.println(nameQueue);
		 
	}
}
