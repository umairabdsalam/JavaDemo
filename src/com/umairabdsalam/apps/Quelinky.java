package com.umairabdsalam.apps;

import java.util.LinkedList;
import java.util.Queue;

public class Quelinky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queue FIFO Data Structure, First in First Out
		//like people in a queue structure to store data
		//add = enqueue, offer()
		//remove = dequeue, poll()

		
			Queue<String> queue = new LinkedList();
			
			System.out.print("Is the queue empty: ");
			System.out.println(queue.isEmpty());
			
			queue.offer("Karen");
			queue.offer("Chad");
			queue.offer("Steve");
			queue.offer("Harold");
			
			queue.poll();
			
			System.out.print("Is the queue empty: ");
			System.out.println(queue.isEmpty());
			System.out.print("Is Harold in the queue: ");
			System.out.println(queue.contains("Harold"));
			System.out.print("Who is at the head of the line: ");
			System.out.println(queue.peek());
		
		
		System.out.println(queue);

	}

}
