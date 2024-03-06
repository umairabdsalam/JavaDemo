package com.umairabdsalam.apps;

import java.util.Arrays;

public class MainBinarySearch {

	public static void main(String[] args) {
		// binary search = Search algorithm that finds the position
		// of a target value within a sorted array. 
		// half of the array is eliminated during each "step"
		
		int array[] = new int[1000000];
		int target = 777777;
		
		for(int i=0; i < array.length; i++) {
			array[i] = i;
		}
		
		//int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target + " not found!");
			
		}
		
		else {
			System.out.println("Element found at: " + index);
		}
		
	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = array.length -1;
		int i = 0;
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			i++;
			System.out.println("middle: " + value + " number of iterations: " + i);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle; //target found
			
		}
		
		
		return -1; //target not found
	}

}
