package com.umairabdsalam.apps;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Priority Queue is a FIFO Data Structure where 
		//higher priority elements are served first
		//before lower priority items
		
		Queue<Double> priqueue = new PriorityQueue(Collections.reverseOrder());
		
		priqueue.offer(3.0);
		priqueue.offer(2.5);
		priqueue.offer(4.0);
		priqueue.offer(1.5);
		priqueue.offer(2.0);
		
		while(!priqueue.isEmpty()) {
			System.out.println(priqueue.poll());
		}

	
	Queue<String> priqueue2 = new PriorityQueue();
	
	priqueue2.offer("B");
	priqueue2.offer("C");
	priqueue2.offer("A");
	priqueue2.offer("F");
	priqueue2.offer("D");
	
	while(!priqueue2.isEmpty()) {
		System.out.println(priqueue2.poll());
	}
	}
}
