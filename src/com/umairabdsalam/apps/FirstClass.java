package com.umairabdsalam.apps;

import java.util.Stack;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stack LIFO Data Structure, Last in First Out
		//vertical tower like structure to store data
		//push() to the top
		//pop() remove from the top
		//peek() examine/return
		//search() the item in the stack
		
		
		
		Stack<String> stack = new Stack<String>();
		
		//System.out.println(stack.empty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		//String stackobj = stack.pop();
		System.out.println(stack);
		//System.out.println(stack.peek());
		System.out.println(stack.search("FIFA"));
		//System.out.println(stackobj);
		
		//System.out.println(stack.empty());
		
		//LinkedList linky = new LinkedList();

		
	}

}
