package com.umairabdsalam.apps;

public class MainLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Linear Search = Iterate through a collection one element at a time.
		
		//     runtime complexity: O(n)
		
		
		// Disadvantages:
		// Slow for large data sets
		
		// Advantages:
	    // Fast for searches of small to medium data sets
		// Does not need to be sorted
		// Useful for data structures that do not have random access (LinkedLists)
		
		int [] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		int index = linearSearch(array, 11);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found!");
		}

	}
	
	private static int linearSearch(int[] array, int value) {
		
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == value) {
				return i;
			}
			
		}
		
		return -1;
	}

	

}
