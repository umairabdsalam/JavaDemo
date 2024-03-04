package com.umairabdsalam.apps;

import java.util.LinkedList;

public class LinkyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedLists store nodes in 2 parts (data + address) 
		//Nodes are in non-consecutive memory locations
		//Elements are linked using pointers
		
		// Singly LinkedList (traverse from head to tail)
		// 		Node 				Node			Node
		//[data + address] -> [data + address] -> [data + address]
		//
		//
		
		
		
		// Doubly LinkedList (traverse either from head to tail or tail to head)
		// 		Node 							Node								Node
		//[address + data + address] -> [address + data + address] -> [address + data + address]
		//
		//
		
		
		  //    advantages?
		  //    1. Dynamic Data Structure (allocates needed memory while running)
		  //    2. Insertion and Deletion of Nodes is easy. O(1) 
		  //    3. No/Low memory waste
		  
		  //    disadvantages?
		  //    1. Greater memory usage (additional pointer)
		  //    2. No random access of elements (no index [i])
		  //    3. Accessing/searching elements is more time consuming. O(n)
		  
		  //    uses?
		  //    1. implement Stacks/Queues
		  //    2. GPS navigation
		  //    3. music playlist
		  // *******************************************************
		
		LinkedList<String> linkyList = new LinkedList<String>();
		
//treating LinkedList as a Stack
//		linkyList.push("A");
//		linkyList.push("B");
//		linkyList.push("C");
//		linkyList.push("D");
//		linkyList.push("F");
//		linkyList.push("Z");
//		linkyList.pop();
		
//treating LinkedList as a Queue
		linkyList.offer("A");
		linkyList.offer("B");
		linkyList.offer("C");
		linkyList.offer("D");
		linkyList.offer("F");
		//linkyList.poll();
		
		linkyList.add(4, "E");
		linkyList.remove("E");
		
		System.out.println(linkyList.indexOf("F"));
		System.out.println(linkyList.peekFirst());
		System.out.println(linkyList.peekLast());
		System.out.println(linkyList);

	}

}
